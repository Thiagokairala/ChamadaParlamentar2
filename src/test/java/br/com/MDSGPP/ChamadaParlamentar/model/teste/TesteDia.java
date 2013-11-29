package br.com.MDSGPP.ChamadaParlamentar.model.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.exception.DataFormatoErradoException;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;
import br.com.MDSGPP.ChamadaParlamentar.model.SessoesEReunioes;

public class TesteDia {
	Dia dia;
	Dia dia2;
	
	@Before
	public void setUp() throws DataFormatoErradoException {
		dia = new Dia();
		dia.setData("10/10/2010");
		ArrayList<SessoesEReunioes> lista = new ArrayList<SessoesEReunioes>();
		SessoesEReunioes sessao = new SessoesEReunioes();
		lista.add(sessao);
		dia.setListaSessoes(lista);
		
		dia2 = new Dia();
	}

	@Test
	public void testGetData() {
		assertNotNull(dia.getData());
		assertTrue(dia.getData().equalsIgnoreCase("10/10/2010"));
	}

	@Test
	public void testSetData() throws DataFormatoErradoException {
		dia2.setData("10/10/2010");
		assertNotNull(dia2.getData());
	}
	
	@Test(expected=DataFormatoErradoException.class) 
	public void testSetDataFormatoErrado() throws DataFormatoErradoException {
		dia2.setData("naoVaiPassar");	
	}

	@Test
	public void testGetListaSessoes() {
		assertNotNull(dia.getListaSessoes());
	}

	@Test
	public void testSetListaSessoes() {
		dia2.setListaSessoes(null);
		assertTrue(dia2.getListaSessoes()==null);
		
		dia2.setListaSessoes(dia.getListaSessoes());
		
		assertNotNull(dia2.getListaSessoes());
	}

	@Test
	public void testGetNumeroSessoes() {
		assertTrue(dia2.getListaSessoes().size()== dia2.getNumeroSessoes());
	}
}
