package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.control.EstatisticaPartidoControl;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaVaziaException;
import br.com.MDSGPP.ChamadaParlamentar.model.EstatisticaPartido;

public class TesteEstatisticaPartidoControl {
	EstatisticaPartidoControl estatistica;
	
	@Before
	public void setUp() {
		estatistica = new EstatisticaPartidoControl();
	}
	
	@Test
	public void testEstatisticaPartidoControl() {
		assertNotNull(estatistica);
	}

	@Test
	public void testGerarEstatisticaPartido()
			throws ClassNotFoundException, SQLException, ListaVaziaException {
		String nomePassar = "PT";
		
		EstatisticaPartido estatistica = 
				EstatisticaPartidoControl.gerarEstatisticaPartido(nomePassar);
		
		assertNotNull(estatistica);
	}
	
	@Test(expected=ListaVaziaException.class)
	public void testGerarEstatisticaPartidoListaVazia() 
			throws ClassNotFoundException, SQLException, ListaVaziaException {
		String nomePassar = "nao deve passar";
		EstatisticaPartido estatistica = EstatisticaPartidoControl.gerarEstatisticaPartido(nomePassar);
	}

	@Test
	public void testFormatarNumeroDouble() {
		double numero = 12.1335413;
		double numero2 = 12.148090;
		
		String numeroPassado = EstatisticaPartidoControl.formatarNumeroDouble(numero);
		String numeroPassado2 = EstatisticaPartidoControl.formatarNumeroDouble(numero2);

		assertTrue(numeroPassado.equalsIgnoreCase("12.13") || numeroPassado.equalsIgnoreCase("12,13"));
		
		assertTrue(numeroPassado2.equalsIgnoreCase("12.15") || numeroPassado2.equalsIgnoreCase("12,15"));
	}

}
