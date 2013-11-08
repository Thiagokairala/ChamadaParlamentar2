package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.text.DecimalFormat;

import br.com.MDSGPP.ChamadaParlamentar.dao.EstatisticaDao;
import br.com.MDSGPP.ChamadaParlamentar.dao.SessoesEReunioesDao;
import br.com.MDSGPP.ChamadaParlamentar.exception.ExceptionEstatistica;
import br.com.MDSGPP.ChamadaParlamentar.exception.ValidaDadosWS;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;

public class EstatisticaControl {

	public EstatisticaControl() {
		// TODO Auto-generated constructor stub
	}
	public static Estatistica gerarEstatisticas(String nome)	{
		Estatistica estatistica = new Estatistica();
		EstatisticaDao dao;
		SessoesEReunioesDao sessoes;
		
		String nomeUper = nome.toUpperCase();
		
		if(ExceptionEstatistica.verificaNome(nomeUper)) {
			try {
				sessoes = new SessoesEReunioesDao();
				dao = new EstatisticaDao();	


				estatistica.setLista(dao.getEstatisticaDeputados(nomeUper));

				estatistica.setNome(nomeUper);


				if(ValidaDadosWS.validaLista(estatistica.getLista())) {
					estatistica.setNumeroSessao(Integer.toString(estatistica.getLista().size()));

					DecimalFormat df = new DecimalFormat("###.00");  
					estatistica.setPorcentagem(df.format(
							(((double)estatistica.getLista().size())/
									((double)sessoes.passarNumeroDeSessoes()))*100) + "%");


				}
				else {
					estatistica.getLista().add("Dados não disponiveis!");
				}
				estatistica.setTotalSessao(Integer.toString(sessoes.passarNumeroDeSessoes()));



			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			estatistica = null;
		}
		return estatistica;
	}

}
