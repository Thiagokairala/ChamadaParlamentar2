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

public class PegarListaDeputados extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		try {
			ArrayList<String> lista = DeputadosControl.getDeputados();
			request.setAttribute("lista", lista);
			rd = request.getRequestDispatcher("/AcompanharParlamentar.jsp");
		} catch (ClassNotFoundException e) {
			rd = request.getRequestDispatcher("/Erro.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
			rd = request.getRequestDispatcher("/Erro.jsp");
		}
		
		rd.forward(request, response);		
	}
}
