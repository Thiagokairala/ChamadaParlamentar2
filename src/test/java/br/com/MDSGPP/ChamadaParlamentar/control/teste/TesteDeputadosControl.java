package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.xml.CategoryDatasetHandler;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.MDSGPP.ChamadaParlamentar.control.DeputadosControl;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;

public class TesteDeputadosControl {
	DeputadosControl deputados;

	@Before
	public void setUp() {
		deputados = new DeputadosControl();
	}

	@Test
	public void testDeputadosControl() {
		assertNotNull(deputados);
	}

	@Test
	public void testGetDeputados() throws ClassNotFoundException, SQLException {
		assertTrue(DeputadosControl.getDeputados().size() != 0);
	}

	@Test
	public void testVerificaExistencia() throws ClassNotFoundException, SQLException {
		String nome1 = "naoVaiPassar";
		String nome2 = "tiririca";
		String nome3 = "JOSÉ AUGUSTO MAIA";

		assertTrue(DeputadosControl.verificaExistencia(nome1) == null);
		assertNotNull(DeputadosControl.verificaExistencia(nome2));
		assertNotNull(DeputadosControl.verificaExistencia(nome3));

	}

	@Test
	public void criarDataset() {
		Estatistica estatistica = Mockito.spy(new Estatistica());

		Mockito.when(estatistica.getNumeroSessao()).thenReturn("50");
		Mockito.when(estatistica.getTotalSessao()).thenReturn("100");

		PieDataset dataSet = DeputadosControl.criarDataset(estatistica);

		assertNotNull(dataSet);
	}

	@Test
	public void testCriarGrafico() {
		Estatistica estatistica = Mockito.spy(new Estatistica());

		Mockito.when(estatistica.getNumeroSessao()).thenReturn("50");
		Mockito.when(estatistica.getTotalSessao()).thenReturn("100");;

		JFreeChart jfc = DeputadosControl.criarGrafico(estatistica);

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

		CategoryDataset dataset = DeputadosControl.
				criarDatasetComparacao(estatistica, estatistica2);
		
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

		JFreeChart jfc = DeputadosControl.gerarGraficoComparacao(estatistica, estatistica2);
	
		assertNotNull(jfc);
	}


}
