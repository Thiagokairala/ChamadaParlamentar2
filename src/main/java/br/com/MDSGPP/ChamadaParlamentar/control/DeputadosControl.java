package br.com.MDSGPP.ChamadaParlamentar.control;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
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
		
		int numeroSessao = Integer.parseInt(estatistica.getNumeroSessao());
		int numeroTotal = Integer.parseInt(estatistica.getTotalSessao());
		
		double presenca = (((double) numeroSessao) / ((double) numeroTotal))*100;
		double falta = 100 - presenca;
		
		final PiePlot3D plot = (PiePlot3D) grafico.getPlot();
		plot.setStartAngle(270);
		plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0} ({2})"));
		plot.setSectionPaint(1, Color.RED);
		plot.setSectionPaint(0, Color.GREEN);
		
		return grafico;		
	}
		
	public CategoryDataset criarDatasetComparacao(Estatistica estatisticaPrimeiro, Estatistica estatisticaSegundo) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		int totalDeSessoes = Integer.parseInt(estatisticaPrimeiro.getTotalSessao());
		int sessoesAssistidasPrimeiro = Integer.parseInt(estatisticaPrimeiro.getNumeroSessao());
		int sessoesAssistidasSegundo = Integer.parseInt(estatisticaSegundo.getNumeroSessao());
		
		double porcentagemPrimeiro = ((((double)sessoesAssistidasPrimeiro) / (double)totalDeSessoes)*100);
		double porcentagemSegundo = ((((double)sessoesAssistidasSegundo) / (double)totalDeSessoes)*100);		
		
		dataset.addValue(porcentagemPrimeiro, estatisticaPrimeiro.getNome(), "Deputados");
		dataset.addValue(porcentagemSegundo, estatisticaSegundo.getNome(), "Deputados");
		return dataset; 
	}

	public JFreeChart gerarGraficoComparacao(Estatistica estatisticaPrimeiro, Estatistica estatisticaSegundo) {
		
		CategoryDataset dataset = criarDatasetComparacao(estatisticaPrimeiro, estatisticaSegundo);
		
		JFreeChart grafico = ChartFactory.createBarChart3D(null, null, "porcentagem"
				, dataset, PlotOrientation.VERTICAL, true, true, false);
		
		grafico.setBackgroundPaint(Color.GRAY);
		return grafico;
		
		
	}
}
