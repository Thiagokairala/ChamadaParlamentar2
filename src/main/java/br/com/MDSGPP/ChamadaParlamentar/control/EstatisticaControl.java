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
		EstatisticaDao dao = new EstatisticaDao();	
		SessoesEReunioesDao sessoes = new SessoesEReunioesDao();
		int numeroTotalSessao = sessoes.passarNumeroDeSessoes();
		
		estatistica.setLista(dao.getEstatisticaDeputados(nome));

		estatistica.setNome(nome);

		estatistica = calcularEstatistica(estatistica, sessoes, numeroTotalSessao);
		estatistica.setTotalSessao(Integer.toString(numeroTotalSessao));
		

		return estatistica;
	}
	
	public static Estatistica gerarEstatisticas(String nome, int numeroTotalSessao) 
			throws ClassNotFoundException, SQLException {
		
		Estatistica estatistica = new Estatistica();
		EstatisticaDao dao = new EstatisticaDao();	
		SessoesEReunioesDao sessoes = new SessoesEReunioesDao();
		
		estatistica.setLista(dao.getEstatisticaDeputados(nome));

		estatistica.setNome(nome);

		estatistica = calcularEstatistica(estatistica, sessoes, numeroTotalSessao);
		estatistica.setTotalSessao(Integer.toString(numeroTotalSessao));
		

		return estatistica;
		
	}
	
	
	public static Estatistica calcularEstatistica
		(Estatistica estatistica, SessoesEReunioesDao sessoes, 
				int numeroTotalSessao) {
		if(ValidaDadosWS.validaLista(estatistica.getLista())) {
			estatistica.setNumeroSessao(Integer.toString(estatistica.getLista().size()));

			DecimalFormat df = new DecimalFormat("###.00");  
			estatistica.setPorcentagem(df.format(
					(((double)estatistica.getLista().size())/
							((double)numeroTotalSessao))*passarPorcentagem) + "%");
		}
		else {
			estatistica.getLista().add("Dados não disponiveis");
		}
		
		return estatistica;
	}
	
	
	public static String arrumarNomePesquisa(Deputados deputado) {
		String montar = deputado.getNomeDeTratamentoDoParlamentar() +
				"-" + deputado.getPartido() + "/" + deputado.getUf();
		return montar.toUpperCase();
	}
}
