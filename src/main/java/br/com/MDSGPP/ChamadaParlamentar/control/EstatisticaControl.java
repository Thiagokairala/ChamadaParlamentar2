package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.text.DecimalFormat;

import br.com.MDSGPP.ChamadaParlamentar.dao.EstatisticaDao;
import br.com.MDSGPP.ChamadaParlamentar.dao.SessoesEReunioesDao;
import br.com.MDSGPP.ChamadaParlamentar.exception.ValidaDadosWS;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;

public class EstatisticaControl {
	
	public static final double passarPorcentagem = 100.0;

	public EstatisticaControl() {
		// TODO Auto-generated constructor stub
	}
	public static Estatistica gerarEstatisticas(String nome)
			throws ClassNotFoundException, SQLException	{
		Estatistica estatistica = new Estatistica();
		EstatisticaDao dao;
		SessoesEReunioesDao sessoes;

		sessoes = new SessoesEReunioesDao();
		dao = new EstatisticaDao();	


		estatistica.setLista(dao.getEstatisticaDeputados(nome));

		estatistica.setNome(nome);


		if(ValidaDadosWS.validaLista(estatistica.getLista())) {
			estatistica.setNumeroSessao(Integer.toString(estatistica.getLista().size()));

			DecimalFormat df = new DecimalFormat("###.00");  
			estatistica.setPorcentagem(df.format(
					(((double)estatistica.getLista().size())/
							((double)sessoes.passarNumeroDeSessoes()))*passarPorcentagem) + "%");
			estatistica.setTotalSessao(Integer.toString(sessoes.passarNumeroDeSessoes()));
		}
		else {
			estatistica = null;
		}
		

		return estatistica;
	}

	public static String arrumarNomePesquisa(Deputados deputado) {
		String montar = deputado.getNomeDeTratamentoDoParlamentar() +
				"-" + deputado.getPartido() + "/" + deputado.getUf();
		return montar.toUpperCase();
	}
}
