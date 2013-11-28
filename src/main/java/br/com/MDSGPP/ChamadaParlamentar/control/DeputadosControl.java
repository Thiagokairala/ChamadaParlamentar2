package br.com.MDSGPP.ChamadaParlamentar.control;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;

public final class DeputadosControl {
	
	public static ArrayList<String> getDeputados() throws ClassNotFoundException, SQLException {

		DeputadoDao deputado;
		deputado = new DeputadoDao();

		return deputado.getNomesDeputados();
	}

	public static Deputados verificaExistencia(String nome) throws ClassNotFoundException, SQLException {
		Deputados deputado = null;

		DeputadoDao deputadoDao = new DeputadoDao();			
		ArrayList<Deputados> lista = deputadoDao.getDeputados();

		for(int i = 0; i<lista.size(); i++) {
			if((lista.get(i).getNomeCivilDoParlamentar().
					equalsIgnoreCase(nome)) ||
					lista.get(i).getNomeDeTratamentoDoParlamentar()
					.equalsIgnoreCase(nome)) {

				deputado = lista.get(i);
			}
		}

		return deputado;
	}
	
	public static PieDataset criarDataset(Estatistica estatistica) {
		DefaultPieDataset grafico = new DefaultPieDataset();
		
		int numeroSessao = Integer.parseInt(estatistica.getNumeroSessao());
		int numeroTotal = Integer.parseInt(estatistica.getTotalSessao());
		
		double presenca = (((double) numeroSessao) / ((double) numeroTotal))*100;
		double falta = 100 - presenca;
		
		grafico.setValue("presenca", presenca);
		grafico.setValue("falta", falta);
		
		return grafico;
	}
	
	public static JFreeChart criarGrafico(Estatistica estatistica) {
		PieDataset dataset = criarDataset(estatistica);
		JFreeChart grafico = ChartFactory.createPieChart3D(null, dataset, true, false, false);
		
		grafico.setBackgroundPaint(Color.gray);
		return grafico;
	}
}
