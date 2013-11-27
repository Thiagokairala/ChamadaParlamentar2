package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.PartidoControl;
import br.com.MDSGPP.ChamadaParlamentar.model.Partidos;

public class PartidoRecebidoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		
		String nomePartido = request.getParameter("nome");
		try {
			Partidos partido = PartidoControl.passarPartido(nomePartido);
			
			if(partido != null) {
				request.setAttribute("partido", partido);
				
				rd = request.getRequestDispatcher("MostrarPartido.jsp");
			}
			else {
				rd = request.getRequestDispatcher("PartidoNaoEcontrado.jsp");
			}	
			
		} catch (ClassNotFoundException e) {
			rd = request.getRequestDispatcher("Erro.jp");
		} catch (SQLException e) {
			rd = request.getRequestDispatcher("Erro.jp");
		}
		
		rd.forward(request, response);
	}
}
