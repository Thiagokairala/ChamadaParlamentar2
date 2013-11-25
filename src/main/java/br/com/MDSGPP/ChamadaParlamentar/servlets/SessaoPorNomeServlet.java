package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.SessoesEReunioesControl;
import br.com.MDSGPP.ChamadaParlamentar.dao.SessoesEReunioesDao;
import br.com.MDSGPP.ChamadaParlamentar.model.SessoesEReunioes;

public class SessaoPorNomeServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		SessoesEReunioes sessao = new SessoesEReunioes();

		String descricao = request.getParameter("descricao");
		try {
			int pagina = 1;
			int deputadosPorPagina = 15;
			
			if(request.getParameter("pagina") != null) {
				pagina = Integer.parseInt(request.getParameter("pagina"));
			}
			sessao = SessoesEReunioesControl.passarSessao(descricao);
			
			if(sessao.getDeputadosPresentes().size() != 0) {
								
				int numeroDeputados = sessao.getDeputadosPresentes().size();	
				int noDePaginas = ((int) Math.ceil(numeroDeputados * 1.0 / deputadosPorPagina))-1;
				
				sessao.setDeputadosPresentes(SessoesEReunioesControl.
						arrumarListaDeputados(pagina-1, deputadosPorPagina, sessao.getDeputadosPresentes()));
				
				request.setAttribute("noDePaginas", noDePaginas);
				request.setAttribute("paginaAtual", pagina);				
				request.setAttribute("sessao", sessao);
				rd = request.getRequestDispatcher("SessaoPorNome.jsp");
			}
			else {
				rd = request.getRequestDispatcher("SessaoNaoEncontrada.jsp");
			}
		} catch (ClassNotFoundException e) {
			rd = request.getRequestDispatcher("Erro.jsp");
		} catch (SQLException e) {
			rd = request.getRequestDispatcher("Erro.jsp");
		}

		rd.forward(request, response);

	}
}
