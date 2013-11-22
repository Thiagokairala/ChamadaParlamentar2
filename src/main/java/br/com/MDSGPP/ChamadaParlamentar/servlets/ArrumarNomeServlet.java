package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArrumarNomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		
		String nome = request.getParameter("nome");
		nome = nome.split("-")[0];
		
		rd = request.getRequestDispatcher("parlamentarRecebido?nome="+ nome);
		rd.forward(request, response);
	}
}
