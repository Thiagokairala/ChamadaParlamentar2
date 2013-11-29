package br.com.MDSGPP.ChamadaParlamentar.util.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.openqa.selenium.remote.RemoteWebDriver.When;

import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;
import br.com.MDSGPP.ChamadaParlamentar.util.LimparLista;

public class TesteLimparLista {
	
	LimparLista limpar;
	
	@Before
	public void setUp() {
		limpar = new LimparLista();
	}
	
	@Test
	public void testLimparListaConstrutor() {
		assertNotNull(limpar);
	}
	
	@Test
	public void testLimparLista() {
		ArrayList<Estatistica> lista = new ArrayList<Estatistica>();
		for(int i = 0; i<10; i++) {
			Estatistica estatistica = Mockito.spy(new Estatistica());
			Mockito.when(estatistica.getNumeroSessao()).thenReturn("50");
			lista.add(estatistica);
		}
		
		for(int i = 0; i<10; i++) {
			Estatistica estatistica = Mockito.spy(new Estatistica());
			lista.add(estatistica);
		}
		
		ArrayList<ArrayList<Estatistica>> listaRecebida = LimparLista.limparLista(lista);
		
		assertNotNull(listaRecebida);
		ArrayList<Estatistica> bons = listaRecebida.get(0);
		ArrayList<Estatistica> ruins = listaRecebida.get(1);
		
		assertNotNull(bons);
		assertNotNull(ruins);
		
		for(int i = 0; i<bons.size(); i++) {
			assertTrue(bons.get(i).getNumeroSessao().equalsIgnoreCase("50"));
			assertTrue(ruins.get(i).getNumeroSessao() == null);
		}
		
	}

}






