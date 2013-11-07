package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ParlamentarRecebido extends javax.servlet.http.HttpServlet {

	protected void service (HttpServletRequest request, HttpServletResponse response) {

		System.out.println("oiOioi");
		String nome = request.getParameter("nome");
		System.out.println(nome);
		/*
		Estatistica estatistica = EstatisticaControl.gerarEstatisticas(nome);

		request.setAttribute("estatistica", estatistica);



		RequestDispatcher rd = request.getRequestDispatcher("/MostrarEstatisticaDeputado.jsp");

		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}	
}