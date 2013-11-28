package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.DeputadosControl;
import br.com.MDSGPP.ChamadaParlamentar.control.EstatisticaControl;
import br.com.MDSGPP.ChamadaParlamentar.exception.ExceptionSqlInjection;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;


public class ParlamentarRecebido extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");

		Deputados deputado = null;
		RequestDispatcher rd = null;

		if(ExceptionSqlInjection.testeSqlInjection(nome)) {
			try {
				int pagina = 1;
				int sessoesPorPagina = 15;

				if(request.getParameter("pagina") != null) {
					pagina = Integer.parseInt(request.getParameter("pagina"));
					nome = nome.split("-")[0];
				}
				deputado = DeputadosControl.verificaExistencia(nome);

				if(deputado != null) {
					ArrayList<String> lista = DeputadosControl.getDeputados();
					Estatistica estatistica = EstatisticaControl.
							gerarEstatisticas(EstatisticaControl.
									arrumarNomePesquisa(deputado));

					int numeroSessoes = estatistica.getLista().size();
					int noDePaginas = ((int) Math.ceil(numeroSessoes * 1.0 / sessoesPorPagina))-1;

					estatistica.setLista(EstatisticaControl.passarListaCerta(pagina-1, sessoesPorPagina, estatistica.getLista()));

					request.setAttribute("noDePaginas", noDePaginas);
					request.setAttribute("paginaAtual", pagina);
					request.setAttribute("lista", lista);
					request.setAttribute("estatistica", estatistica);
					rd = request.getRequestDispatcher("/MostrarEstatisticaDeputado.jsp");
				}
				else {
					rd = request.getRequestDispatcher("/DeputadoNaoEncontrado.jsp");
				}
			} catch (ClassNotFoundException e1) {
				rd = request.getRequestDispatcher("/Erro.jsp");
			} catch (SQLException e) {
				rd = request.getRequestDispatcher("/Erro.jsp");
			} catch (IndexOutOfBoundsException e) {
				rd = request.getRequestDispatcher("/DeputadoNaoEncontrado.jsp");
			}
		}
		else {
			rd = request.getRequestDispatcher("SqlDetectado.jsp");
		}

		rd.forward(request, response);
	}        
}