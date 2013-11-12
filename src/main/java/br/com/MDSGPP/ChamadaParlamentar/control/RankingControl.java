package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.dao.SessoesEReunioesDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;
import br.com.MDSGPP.ChamadaParlamentar.model.Ranking;

public class RankingControl {

	public RankingControl() {
		
	}
		
	public static Ranking gerarRanking(ArrayList<Estatistica> lista) {
		int confere = 0;
		Ranking ranking = new Ranking();
		SessoesEReunioesDao sessoes;
		try {
			sessoes = new SessoesEReunioesDao();
			
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return ranking;	
	}
	
	public static ArrayList<Estatistica> gerarListaEstatistica(ArrayList<Deputados> lista) {
		
		ArrayList<Estatistica> devolver = new ArrayList<Estatistica>();
		for(int i = 0; i< lista.size(); i++) {
			String nome = EstatisticaControl.arrumarNomePesquisa(lista.get(i));
			
			devolver.add(EstatisticaControl.gerarEstatisticas(nome));
		}
		
		return devolver;
	}
}