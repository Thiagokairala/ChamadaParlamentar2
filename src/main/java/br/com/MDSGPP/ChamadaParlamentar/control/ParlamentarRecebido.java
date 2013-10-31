package br.com.MDSGPP.ChamadaParlamentar.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;


public class ParlamentarRecebido extends javax.servlet.http.HttpServlet {

	private static final long serialVersionUID = 1L;


	protected void service (HttpServletRequest request, HttpServletResponse response) {

		String nome = request.getParameter("deputado");

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
		}
	}	
}