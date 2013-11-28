package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.DeputadosControl;
import br.com.MDSGPP.ChamadaParlamentar.control.EstatisticaControl;
import br.com.MDSGPP.ChamadaParlamentar.exception.ExceptionSqlInjection;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;

public class SegundoParlamentarServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomePrimeiroParlamentar = request.getParameter("primeiroParlamentar");
		nomePrimeiroParlamentar = nomePrimeiroParlamentar.split("-")[0];

		String nomeSegundoParlamentar = request.getParameter("nome");
		Deputados primeiroDeputado = null;
		Deputados segundoDeputado = null;
		RequestDispatcher rd = null;

		if(ExceptionSqlInjection.testeSqlInjection(nomeSegundoParlamentar)) {
			try {
				primeiroDeputado = DeputadosControl.verificaExistencia(nomePrimeiroParlamentar);
				segundoDeputado = DeputadosControl.verificaExistencia(nomeSegundoParlamentar);


				if(segundoDeputado != null) {
					Estatistica estatisticaPrimeiro = EstatisticaControl.
							gerarEstatisticas(EstatisticaControl.
									arrumarNomePesquisa(primeiroDeputado));

					Estatistica estatisticaSegundo = EstatisticaControl.
							gerarEstatisticas(EstatisticaControl.
									arrumarNomePesquisa(segundoDeputado));

					request.setAttribute("estatisticaPrimeiro", estatisticaPrimeiro);
					request.setAttribute("estatisticaSegundo", estatisticaSegundo);

					rd = request.getRequestDispatcher("/MostrarComparacaoDeputados.jsp");
				}
				else {
					rd = request.getRequestDispatcher("/DeputadoNaoEncontrado.jsp");
				}
			} catch (ClassNotFoundException e1) {
				rd = request.getRequestDispatcher("/Erro.jsp");
			} catch (SQLException e) {
				rd = request.getRequestDispatcher("/Erro.jsp");
			}
		}
		else {
			rd = request.getRequestDispatcher("SqlDetectado.jsp");
		}

		rd.forward(request, response);

	}
}
