package br.com.MDSGPP.ChamadaParlamentar.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ParlamentarRecebido extends javax.servlet.http.HttpServlet {


	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request, HttpServletResponse response) {

		System.out.println("oiOioi");
		String nome = request.getParameter("nome");
		System.out.println(nome);
	}	
}