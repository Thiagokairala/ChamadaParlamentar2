package br.com.MDSGPP.ChamadaParlamentar.util.teste;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.PieDataset;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.MDSGPP.ChamadaParlamentar.control.DeputadosControl;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;
import br.com.MDSGPP.ChamadaParlamentar.util.Graficos;

public class TesteGraficos {
	
	@Test
	public void testeGraficos() {
		assertNotNull(new Graficos());
	}
	
	@Test
	public void criarDataset() {
		Estatistica estatistica = Mockito.spy(new Estatistica());

		Mockito.when(estatistica.getNumeroSessao()).thenReturn("50");
		Mockito.when(estatistica.getTotalSessao()).thenReturn("100");

		PieDataset dataSet = Graficos.criarDataset(estatistica);

		assertNotNull(dataSet);
	}
	

	@Test
	public void testCriarGrafico() {
		Estatistica estatistica = Mockito.spy(new Estatistica());

		Mockito.when(estatistica.getNumeroSessao()).thenReturn("50");
		Mockito.when(estatistica.getTotalSessao()).thenReturn("100");;

		JFreeChart jfc = Graficos.criarGrafico(estatistica);

		assertNotNull(jfc);
	}

	@Test
	public void criarDatasetComparacao() {
		Estatistica estatistica = Mockito.spy(new Estatistica());
		Estatistica estatistica2 = Mockito.spy(new Estatistica());

		Mockito.when(estatistica.getNumeroSessao()).thenReturn("50");
		Mockito.when(estatistica.getTotalSessao()).thenReturn("100");
		Mockito.when(estatistica.getNome()).thenReturn("nome do deputado");

		Mockito.when(estatistica2.getNumeroSessao()).thenReturn("50");
		Mockito.when(estatistica2.getTotalSessao()).thenReturn("100");
		Mockito.when(estatistica2.getNome()).thenReturn("nome do deputado2");

		ArrayList<Estatistica> lista = new ArrayList<Estatistica>();
		lista.add(estatistica);
		lista.add(estatistica2);
		
		CategoryDataset dataset = Graficos.
				criarDatasetComparacao(lista);
		
		assertNotNull(dataset);
	}
	
	@Test
	public void testCriarGraficoComparacao() {
		Estatistica estatistica = Mockito.spy(new Estatistica());
		Estatistica estatistica2 = Mockito.spy(new Estatistica());

		Mockito.when(estatistica.getNumeroSessao()).thenReturn("50");
		Mockito.when(estatistica.getTotalSessao()).thenReturn("100");
		Mockito.when(estatistica.getNome()).thenReturn("nome do deputado");

		Mockito.when(estatistica2.getNumeroSessao()).thenReturn("50");
		Mockito.when(estatistica2.getTotalSessao()).thenReturn("100");
		Mockito.when(estatistica2.getNome()).thenReturn("nome do deputado2");
		
		ArrayList<Estatistica> lista = new ArrayList<Estatistica>();
		
		lista.add(estatistica);
		lista.add(estatistica2);

		JFreeChart jfc = Graficos.gerarGraficoComparacao(lista);
	
		assertNotNull(jfc);
	}
}
