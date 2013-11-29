package br.com.MDSGPP.ChamadaParlamentar.control;

import java.awt.Color;
import java.sql.SQLException;
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
}
