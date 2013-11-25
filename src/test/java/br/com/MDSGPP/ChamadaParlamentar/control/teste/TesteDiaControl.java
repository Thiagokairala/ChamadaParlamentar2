package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.control.DiaControl;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;

public class TesteDiaControl {
	DiaControl control;
	
	
	@Before
	public void setUp() {
		control = new DiaControl();
	}
	
	//@Test
	public void testDiaControl() {
		assertNotNull(control);
	}
	
	@Test
	public void testGetDias() throws ClassNotFoundException, SQLException {
		ArrayList<Dia> dias = DiaControl.getDias();
		
		assertNotNull(dias);
		assertTrue(dias.size() != 0);
	}

	@Test
	public void testGetListaCerta() throws ClassNotFoundException, SQLException {
		ArrayList<Dia> dias = DiaControl.getDias();
		
		int pagina = 1;
		int pagina2 = 2;
		int datasPorPagina = 5;
		int paginaFinal =(int) (dias.size()/datasPorPagina);
		
		ArrayList<Dia> diasTeste = DiaControl.getListaCerta(pagina-1, datasPorPagina, dias);
		ArrayList<Dia> diasTeste2 = DiaControl.getListaCerta(pagina2-1, datasPorPagina, dias);
		ArrayList<Dia> diasTesteFinal = DiaControl.getListaCerta(paginaFinal-1, datasPorPagina, dias);
		ArrayList<Dia> diasTesteFinalReal = DiaControl.getListaCerta(paginaFinal, datasPorPagina, dias);
		assertNotNull(diasTeste);
		
		assertTrue(diasTeste.size() == datasPorPagina);
		assertTrue(diasTeste2.size() == datasPorPagina);
		assertNotNull(diasTesteFinal.size());
		assertNotNull(diasTesteFinalReal);
		
		for(int i =0; i<diasTeste.size(); i++) {
			assertTrue(diasTeste.get(i).equals(dias.get(i+((pagina-1)*datasPorPagina))));
			assertTrue(diasTeste2.get(i).equals(dias.get(i+((pagina2-1)*datasPorPagina))));
			if(i < diasTesteFinal.size()) {
				assertTrue(diasTesteFinal.get(i).equals(dias.get(i+((paginaFinal-1)*datasPorPagina))));
			}
		}
	
	}
	@Test
	public void testPassarData() throws ClassNotFoundException, SQLException{
		Dia dia1 = DiaControl.passarData("20/11/2011"); //esse deve retornar um dia null
		Dia dia2 = DiaControl.passarData("22/11/2011"); //esse deve passar normalmente
		Dia dia3 = DiaControl.passarData("nao deve passar"); //esse espera uma data null
		
		
		assertTrue(dia1 == null);		
		assertTrue(dia2.getListaSessoes().size() > 0);
		assertTrue(dia3 == null);
	}
}
