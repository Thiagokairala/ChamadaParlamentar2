package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.RankingControl;
import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaRankingException;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaVaziaException;
import br.com.MDSGPP.ChamadaParlamentar.model.Ranking;

public class RankingServ extends javax.servlet.http.HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Ranking ranking = null;
		RequestDispatcher rd = null;

		try {
			ranking = RankingControl.passarRankingTop5();
			request.setAttribute("ranking", ranking);
			rd= request.getRequestDispatcher("/Ranking.jsp");

		} catch (ClassNotFoundException e) {
			rd= request.getRequestDispatcher("/Erro.jsp");
		} catch (SQLException e) {
			rd= request.getRequestDispatcher("/Erro.jsp");
		}
		
		
		rd.forward(request, response);
	}
}
