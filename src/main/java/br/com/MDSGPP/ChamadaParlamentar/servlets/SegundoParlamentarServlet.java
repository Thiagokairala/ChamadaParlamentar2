package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;

import br.com.MDSGPP.ChamadaParlamentar.control.DeputadosControl;
import br.com.MDSGPP.ChamadaParlamentar.control.EstatisticaControl;
import br.com.MDSGPP.ChamadaParlamentar.exception.ExceptionSqlInjection;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaVaziaException;
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
					
					JFreeChart grafico = DeputadosControl.gerarGraficoComparacao(estatisticaPrimeiro, estatisticaSegundo);

					final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
					final File arquivo = new File(getServletContext().getRealPath(".") + "/comparacaoDeputado.png");

					ChartUtilities.saveChartAsPNG(arquivo, grafico, 500, 300, info);
					
					Thread.sleep(2000);

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
			} catch (NumberFormatException e) {
				rd = request.getRequestDispatcher("/DadosNaoDisponiveis.jsp");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ListaVaziaException e) {
				rd = request.getRequestDispatcher("/DadosNaoDisponiveis.jsp");
			}
		}
		else {
			rd = request.getRequestDispatcher("SqlDetectado.jsp");
		}

		rd.forward(request, response);

	}
}
