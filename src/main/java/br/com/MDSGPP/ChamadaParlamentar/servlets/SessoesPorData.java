package br.com.MDSGPP.ChamadaParlamentar.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.control.DiaControl;
import br.com.MDSGPP.ChamadaParlamentar.exception.ExceptionDia;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;

public class SessoesPorData extends HttpServlet {

	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;


		String data = request.getParameter("datas");
		try {
			Dia dia = new DiaControl().passarData(data);

			if(ExceptionDia.verificaData(dia.getListaSessoes().size())){

				request.setAttribute("dia", dia);
				rd = request.getRequestDispatcher("/MostrarDia.jsp");
			}else{
				rd = request.getRequestDispatcher("/DataNaoEncontrada.jsp");
			}

		} catch (ClassNotFoundException e) {
			rd = request.getRequestDispatcher("/Erro.jsp");
		} catch (SQLException e) {
			rd = request.getRequestDispatcher("/Erro.jsp");
		}
		
		rd.forward(request, response);

	}
}
