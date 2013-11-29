package br.com.MDSGPP.ChamadaParlamentar.util;

import java.awt.Color;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;

public class Graficos {
	public static CategoryDataset criarDatasetComparacao(ArrayList<Estatistica> lista) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();


		for(int i = 0; i<lista.size(); i++) {
			int totalDeSessoes = Integer.parseInt(lista.get(i).getTotalSessao());
			int sessoesAssistidas = Integer.parseInt(lista.get(i).getNumeroSessao());
			
			double porcentagem = ((((double)sessoesAssistidas) / (double)totalDeSessoes)*100);
			
			dataset.addValue(porcentagem, lista.get(i).getNome(), "Deputados");
		}
		dataset.addValue(100.0, "total", "Deputados");
		return dataset; 
	}

	public static JFreeChart gerarGraficoComparacao(ArrayList<Estatistica> lista) {

		CategoryDataset dataset = criarDatasetComparacao(lista);

		JFreeChart grafico = ChartFactory.createBarChart3D(null, null, "porcentagem"
				, dataset, PlotOrientation.VERTICAL, true, true, false);

		grafico.setBackgroundPaint(Color.WHITE.darker());

		BarRenderer3D alterar = (BarRenderer3D) grafico.getCategoryPlot().getRenderer();

		alterar.setMaximumBarWidth(0.1);
		return grafico;
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

}
