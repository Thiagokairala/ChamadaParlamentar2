package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.RankingControl;
import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Ranking;

public class RankingServ extends javax.servlet.http.HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request, HttpServletResponse response) {
		Ranking ranking = null;

		try {
			ranking = RankingControl.gerarRanking
					(RankingControl.gerarListaEstatistica(new DeputadoDao().getDeputados()));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		request.setAttribute("ranking", ranking);
		RequestDispatcher rd = request.getRequestDispatcher("/Ranking.jsp");

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
