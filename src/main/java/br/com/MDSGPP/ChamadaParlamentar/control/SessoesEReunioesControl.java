package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.dao.SessoesEReunioesDao;
import br.com.MDSGPP.ChamadaParlamentar.model.SessoesEReunioes;

public class SessoesEReunioesControl {

	public SessoesEReunioesControl() {
		
	}
	
	public static SessoesEReunioes passarSessao(String descricao) 
			throws ClassNotFoundException, SQLException {
		SessoesEReunioesDao dao = new SessoesEReunioesDao();
		
		ArrayList<String> lista = dao.procurarSessao(descricao);
		
		SessoesEReunioes passar = new SessoesEReunioes();
		passar.setDeputadosPresentes(lista);
		passar.setDescricao(descricao);
		
		return passar;		
	}
}
