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

	public static ArrayList<String> arrumarListaDeputados(int pagina, 
			int deputadosPorPagina, ArrayList<String> deputadosPresentes) {
		ArrayList<String> listaPassar = new ArrayList<String>();

		for(int i = 0; i< deputadosPorPagina; i++) {
			if(pagina == 0) {
				listaPassar.add(deputadosPresentes.get(i));
			}
			else {
				if(i+(pagina*deputadosPorPagina) < deputadosPresentes.size()) {
					listaPassar.add(deputadosPresentes.get(i+ (pagina*deputadosPorPagina)));
				}
			}
		}
		
		return listaPassar;
	}
}
