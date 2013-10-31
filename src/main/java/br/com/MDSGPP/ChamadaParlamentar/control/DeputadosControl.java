package br.com.MDSGPP.ChamadaParlamentar.control;


import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.rpc.ServiceException;

import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.dao.SessoesEReunioesDao;

public class DeputadosControl {

	public DeputadosControl() {
	
	}

	public ArrayList<String> getDeputados() {
		
		DeputadoDao deputado;
		try {
			deputado = new DeputadoDao();
			
			//apagar isso dps
				try {
					SessoesEReunioesDao sessao;
					
					sessao = new SessoesEReunioesDao();
					
					sessao.adcionarDataNaTable("20/11/2012", "440");
					sessao.adcionarSessaoNaTable("20/11/2012");
					
				} catch (MalformedURLException | ServiceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//ate aqui
			
			
			
			return deputado.getNomesDeputados();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
