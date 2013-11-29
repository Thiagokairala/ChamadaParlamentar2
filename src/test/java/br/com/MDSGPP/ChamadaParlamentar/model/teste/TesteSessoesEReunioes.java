package br.com.MDSGPP.ChamadaParlamentar.model.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.exception.DataFormatoErradoException;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.SessoesEReunioes;

public class TesteSessoesEReunioes {


	SessoesEReunioes sessoes;
	SessoesEReunioes sessoesTeste; 

	@Before
	public void setUp() throws DataFormatoErradoException {
		ArrayList<Deputados> listaTeste = new ArrayList<Deputados>();
		sessoes = new SessoesEReunioes();
		sessoesTeste = new 
				SessoesEReunioes("11/12/2012", "descricaoDeTeste", listaTeste, "descricaoTeste");
	}

	@Test
	public void testSessoesEReunioesStringStringArrayListOfDeputados() 
			throws DataFormatoErradoException {
		ArrayList<Deputados> lista = new ArrayList<Deputados>();
		SessoesEReunioes sessoes2 = new 
				SessoesEReunioes("11/12/2012", "descricaoDeTeste", lista,
						"descricaoTeste");
		

		assertNotNull(sessoes2);
	}
	
	@Test(expected=DataFormatoErradoException.class)
	public void testSessoesEReunioesComException() throws DataFormatoErradoException {
		ArrayList<Deputados> lista = new ArrayList<Deputados>();
		SessoesEReunioes sessoes3 = new 
				SessoesEReunioes("oioi", "não pode passar", lista, "descricaoTeste");
	}

	@Test
	public void testSessoesEReunioes() {
		assertNotNull(sessoes);
	}

	@Test
	public void testGetData() {
		assertTrue(sessoesTeste.getData().equals("11/12/2012"));
	}

	@Test
	public void testSetData() throws DataFormatoErradoException {
		sessoes.setData("11/12/2012");
		assertTrue(sessoes.getData().equals("11/12/2012"));
	}
	
	@Test(expected=DataFormatoErradoException.class)
	public void testSetDataFormatoErrado() throws DataFormatoErradoException {
		sessoes.setData("nao deve passar");
	}

	@Test
	public void testGetDescricao() {
		assertTrue(sessoesTeste.getDescricao().equals("descricaoDeTeste"));
	}

	@Test
	public void testSetDescricao() {
		sessoes.setDescricao("descricaoDeTeste");
		assertTrue(sessoes.getDescricao().equals("descricaoDeTeste"));
	}

	@Test
	public void testGetDeputados() {
		assertNotNull(sessoesTeste.getDeputados());
	}

	@Test
	public void testSetDeputados() {
		Deputados deputado = new Deputados();
		deputado.setNomeDeTratamentoDoParlamentar("teste");
		ArrayList<Deputados> lista = new ArrayList<Deputados>();
		lista.add(deputado);
		sessoes.setDeputados(lista);

		assertTrue(sessoes.getDeputados()
				.get(0).getNomeDeTratamentoDoParlamentar()
				.equals("teste"));
	}
	
	@Test
	public void testGetDescricaoCompleta() {
		assertNotNull(sessoesTeste.getDescricaoCompleta());
	}
	
	@Test
	public void testSetDescricaoCompleta() {
		sessoes.setDescricaoCompleta("teste");
		
		assertTrue(sessoes.getDescricaoCompleta().equalsIgnoreCase("teste"));
	}
	
	@Test
	public void testGetDeputadosPresentes() {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("teste");
		lista.add("teste2");
		
		sessoes.setDeputadosPresentes(lista);
		assertTrue(sessoes.getDeputadosPresentes().size() == 2);
		assertNotNull(sessoes.getDeputadosPresentes().get(0));
		assertNotNull(sessoes.getDeputadosPresentes().get(1));
	}
	
	@Test
	public void testSetDeputadosPresentes() {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("teste");
		lista.add("teste2");
		sessoes.setDeputadosPresentes(null);
		
		assertTrue(sessoes.getDeputadosPresentes() == null);
		sessoes.setDeputadosPresentes(lista);
		assertTrue(sessoes.getDeputadosPresentes().size() == 2);
		assertNotNull(sessoes.getDeputadosPresentes().get(0));
		assertNotNull(sessoes.getDeputadosPresentes().get(1));
	}
	

}
