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
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;


public class ParlamentarRecebido extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request, HttpServletResponse response) {
		String nome = request.getParameter("nome");

		Deputados deputado = null;
		RequestDispatcher rd = null;

		try {
			deputado = DeputadosControl.verificaExistencia(nome);
			
			int pagina = 1;
			int sessoesPorPagina = 10;
			
			if(request.getParameter("pagina") != null) {
				pagina = Integer.parseInt(request.getParameter("pagina"));
			}
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
		}


		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}        
}