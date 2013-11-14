package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.RankingControl;
import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Ranking;

public class RankingCompleto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request, HttpServletResponse response) {
		Ranking ranking = null;
		RequestDispatcher rd = null;

		try {
			ranking = RankingControl.gerarRanking
					(RankingControl.gerarListaEstatistica(new DeputadoDao().getDeputados()));
			request.setAttribute("ranking", ranking);
			rd= request.getRequestDispatcher("/RankingCompleto.jsp");

		} catch (ClassNotFoundException e) {
			rd= request.getRequestDispatcher("/Erro.jsp");
			e.printStackTrace();
		} catch (SQLException e) {
			rd= request.getRequestDispatcher("/Erro.jsp");
			e.printStackTrace();
		}

		try {
			rd.forward(request, response);
		} catch (ServletException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

