package br.com.MDSGPP.ChamadaParlamentar.model.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;

public class TesteDeputados {
	Deputados deputado;
	Deputados deputado2;
	
	@Before
	public void setUp() {
		deputado = new Deputados();
		deputado2 = new Deputados
				(123, 124, 125, "pedro", "pedrin", "masculino", 
						"DF", "PT", "123", "2",
						"123456789", "alguem@algumacoisa");
	}
	
	@Test
	public void testDeputados() {
		assertNotNull(deputado);
	}

	@Test
	public void testDeputadosIntIntIntStringStringStringStringStringStringStringStringString() {
		Deputados deputadoTeste = new Deputados
				(123, 124, 125, "pedro", "pedrin", "masculino", 
						"DF", "PT", "123", "2",
						"123456789", "alguem@algumacoisa");
	
		assertNotNull(deputadoTeste);
		assertTrue(deputadoTeste.getIdDoParlamentar() == 123);
		assertTrue(deputadoTeste.getMatricula() == 124);
		assertTrue(deputadoTeste.getIdeCadastro()== 125);
		assertTrue(deputadoTeste.getNomeCivilDoParlamentar().equals("pedro"));
		assertTrue(deputadoTeste.getNomeDeTratamentoDoParlamentar().equals("pedrin"));
		assertTrue(deputadoTeste.getSexo().equals("masculino"));
		assertTrue(deputadoTeste.getUf().equals("DF"));
		assertTrue(deputadoTeste.getPartido().equals("PT"));
		assertTrue(deputadoTeste.getNumeroDoGabinete().equals("123"));
		assertTrue(deputadoTeste.getAnexo().equals("2"));
		assertTrue(deputadoTeste.getTelefone().equals("123456789"));
		assertTrue(deputadoTeste.getEmail().equals("alguem@algumacoisa"));
		
	}

	@Test
	public void testGetIdDoParlamentar() {
		assertNotNull(deputado2.getIdDoParlamentar());
	}

	@Test
	public void testSetIdDoParlamentar() {
		deputado.setIdDoParlamentar(123);
		assertNotNull(deputado.getIdDoParlamentar());
	}

	@Test
	public void testGetNomeCivilDoParlamentar() {
		assertNotNull(deputado2.getNomeCivilDoParlamentar());
	}

	@Test
	public void testSetNomeCivilDoParlamentar() {
		deputado.setNomeCivilDoParlamentar("teste");
		assertNotNull(deputado.getNomeCivilDoParlamentar());
	}

	@Test
	public void testGetNomeDeTratamentoDoParlamentar() {
		assertNotNull(deputado2.getNomeDeTratamentoDoParlamentar());
	}

	@Test
	public void testSetNomeDeTratamentoDoParlamentar() {
		deputado.setNomeDeTratamentoDoParlamentar("teste");;
		assertNotNull(deputado.getNomeDeTratamentoDoParlamentar());
	}

	@Test
	public void testGetSexo() {
		assertNotNull(deputado2.getSexo());
	}

	@Test
	public void testSetSexo() {
		deputado.setSexo("masculino");
		assertNotNull(deputado.getSexo());
	}

	@Test
	public void testGetUf() {
		assertNotNull(deputado2.getUf());
	}

	@Test
	public void testSetUf() {
		deputado.setUf("df");
		assertNotNull(deputado.getUf());
	}

	@Test
	public void testGetPartido() {
		assertNotNull(deputado2.getPartido());
	}

	@Test
	public void testSetPartido() {
		deputado.setPartido("PT");
		assertNotNull(deputado.getPartido());
	}

	@Test
	public void testGetNumeroDoGabinete() {
		assertNotNull(deputado2.getNumeroDoGabinete());
	}

	@Test
	public void testSetNumeroDoGabinete() {
		deputado.setNumeroDoGabinete("123456");
		assertNotNull(deputado.getNumeroDoGabinete());
	}

	@Test
	public void testGetAnexo() {
		assertNotNull(deputado2.getAnexo());
	}

	@Test
	public void testSetAnexo() {
		deputado.setAnexo("1");
		assertNotNull(deputado.getAnexo());
	}

	@Test
	public void testGetTelefone() {
		assertNotNull(deputado2.getTelefone());
	}

	@Test
	public void testSetTelefone() {
		deputado.setTelefone("123456");
		assertNotNull(deputado.getTelefone());
	}

	@Test
	public void testGetEmail() {
		assertNotNull(deputado2.getEmail());
	}

	@Test
	public void testSetEmail() {
		deputado.setEmail("teste");;
		assertNotNull(deputado.getEmail());
	}

	@Test
	public void testGetMatricula() {
		assertNotNull(deputado2.getMatricula());
	}

	@Test
	public void testSetMatricula() {
		deputado.setMatricula(123);
		assertNotNull(deputado.getMatricula());
	}

	@Test
	public void testGetIdeCadastro() {
		assertNotNull(deputado2.getIdeCadastro());
	}

	@Test
	public void testSetIdeCadastro() {
		deputado.setIdeCadastro(123);
		assertNotNull(deputado.getIdeCadastro());
	}

}
