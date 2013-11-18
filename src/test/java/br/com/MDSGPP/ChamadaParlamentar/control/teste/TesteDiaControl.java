package br.com.MDSGPP.ChamadaParlamentar.control.teste;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import br.com.MDSGPP.ChamadaParlamentar.control.DiaControl;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;

public class TesteDiaControl {

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
		
		ArrayList<Dia> diasTeste = DiaControl.getListaCerta(pagina, datasPorPagina, dias);
		ArrayList<Dia> diasTeste2 = DiaControl.getListaCerta(pagina2, datasPorPagina, dias);
		ArrayList<Dia> diasTesteFinal = DiaControl.getListaCerta(paginaFinal, datasPorPagina, dias);
		assertNotNull(diasTeste);
		
		assertTrue(diasTeste.size() == datasPorPagina);
		assertTrue(diasTeste2.size() == datasPorPagina);
		assertNotNull(diasTesteFinal.size());
		
		for(int i =0; i<diasTeste.size(); i++) {
			assertTrue(diasTeste.get(i).equals(dias.get(i+(pagina*datasPorPagina))));
			assertTrue(diasTeste2.get(i).equals(dias.get(i+(pagina2*datasPorPagina))));
			if(i < diasTesteFinal.size()) {
				assertTrue(diasTesteFinal.get(i).equals(dias.get(i+(paginaFinal*datasPorPagina))));
			}
		}
	
	}

}
