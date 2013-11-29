package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.DiaControl;
import br.com.MDSGPP.ChamadaParlamentar.exception.DataFormatoErradoException;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;

public class SessoesEReunioesServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request, HttpServletResponse response) {
		RequestDispatcher rd = null;
		
		try {		
			int pagina = 1;
			int datasPorPagina = 10;
			
			
			if(request.getParameter("pagina") != null) {
				pagina = Integer.parseInt(request.getParameter("pagina"));
			}
			
			ArrayList<Dia> dia = DiaControl.getDias();
				
			int numeroDatas = dia.size();	
							
			int noDePaginas = ((int) Math.ceil(numeroDatas * 1.0 / datasPorPagina))-1;
			
			ArrayList<Dia> diaPassar = DiaControl.getListaCerta(pagina-1, datasPorPagina, dia);
			
			
			request.setAttribute("noDePaginas", noDePaginas);
			request.setAttribute("paginaAtual", pagina);
			request.setAttribute("dias", diaPassar);
			request.setAttribute("diasAuto", dia);
					
			rd = request.getRequestDispatcher("AcompanharSessao.jsp");
		} catch (ClassNotFoundException e) {
			rd = request.getRequestDispatcher("Erro.jsp");
		} catch (SQLException e) {
			rd = request.getRequestDispatcher("Erro.jsp");
		} catch (DataFormatoErradoException e) {
			rd = request.getRequestDispatcher("FormatoErrado.jsp");
		}
		
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
