package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.PartidoControl;

public class PartidoAutoCompleteServlet extends javax.servlet.http.HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		RequestDispatcher rd = null;
		
		try {
			ArrayList<ArrayList<String>> listaAutoComplete = PartidoControl.passarListaPartidos();
			
			request.setAttribute("lista", listaAutoComplete);
			
			rd = request.getRequestDispatcher("AcompanharPartido.jsp");
		
		} catch (ClassNotFoundException e) {
			rd = request.getRequestDispatcher("Erro.jsp");
		} catch (SQLException e) {
			rd = request.getRequestDispatcher("Erro.jsp");
		}
		
		rd.forward(request, response);
	}
}
