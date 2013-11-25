package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.dao.EstatisticaDao;
import br.com.MDSGPP.ChamadaParlamentar.dao.SessoesEReunioesDao;
import br.com.MDSGPP.ChamadaParlamentar.exception.ValidaDadosWS;
import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;

public class EstatisticaControl {
	
	public static final double PASSAR_PORCENTAGEM = 100.0;
	
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
							((double)numeroTotalSessao))*PASSAR_PORCENTAGEM) + "%");
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
	
	public static ArrayList<String> passarListaCerta(int pagina, int sessoesPorPagina, ArrayList<String> lista ) {
		ArrayList<String> listaPassar = new ArrayList<String>();
		lista = ordenarLista(lista);
		
		for(int i = 0; i< sessoesPorPagina; i++) {
			if(pagina == 0) {
				listaPassar.add(lista.get(i));
			}
			else {
				if(i+(pagina*sessoesPorPagina) < lista.size()) {
					listaPassar.add(lista.get(i+ (pagina*sessoesPorPagina)));
				}
			}
		}		
		return listaPassar;
	}
	
	public static ArrayList<String> ordenarLista(ArrayList<String> lista) {
		ArrayList<String> ordenada = new ArrayList<String>();
		
		for(int i = 0; i<lista.size(); i++) {
			ordenada.add(lista.get(lista.size() -1 - i));
		}
		
		return ordenada;
	}
}
