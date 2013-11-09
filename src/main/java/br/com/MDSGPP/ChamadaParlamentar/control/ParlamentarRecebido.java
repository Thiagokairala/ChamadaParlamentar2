package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;


public class ParlamentarRecebido extends javax.servlet.http.HttpServlet {


	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request, HttpServletResponse response) {
		String nome = request.getParameter("nome");

		Deputados deputado = null;
		DeputadoDao deputadoDao = null;
		
		try {
			deputadoDao = new DeputadoDao();
		} catch (ClassNotFoundException e) {

		}
		
		try {
			deputado = deputadoDao.receberDadosDeputadoCivil(nome);
		} catch (SQLException e) {
			try {
				deputado = deputadoDao.receberDadosDeputadoTratamento(nome);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		System.out.println(deputado);
		
		
	}	
}