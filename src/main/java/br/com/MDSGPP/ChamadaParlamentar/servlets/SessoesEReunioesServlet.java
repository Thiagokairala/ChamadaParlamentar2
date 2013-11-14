package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.DiaControl;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;

public class SessoesEReunioesServlet extends HttpServlet {
	
	protected void service (HttpServletRequest request, HttpServletResponse response) {
		RequestDispatcher rd = null;
		
		try {
			ArrayList<Dia> dia = DiaControl.getDias();
			request.setAttribute("dias", dias);
		} catch (ClassNotFoundException e) {
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
