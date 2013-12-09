package br.com.MDSGPP.ChamadaParlamentar.atualizacaoBanco;

import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.xml.rpc.ServiceException;

import br.com.MDSGPP.ChamadaParlamentar.classesDeConexao.ConexaoComWsSessoesEReunioes;
import br.com.MDSGPP.ChamadaParlamentar.control.RankingControl;
import br.com.MDSGPP.ChamadaParlamentar.dao.Dao;
import br.com.MDSGPP.ChamadaParlamentar.dao.DeputadoDao;
import br.com.MDSGPP.ChamadaParlamentar.dao.RankingDao;
import br.com.MDSGPP.ChamadaParlamentar.dao.SessoesEReunioesDao;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaRankingException;
import br.com.MDSGPP.ChamadaParlamentar.exception.ListaVaziaException;
import br.com.MDSGPP.ChamadaParlamentar.model.Ranking;

public class AtualizarBanco {
	Timer timer;
	/**
	 * Método para iniciar a execução das tarefas.
	 */
	public AtualizarBanco() {

		timer = new Timer();
		//Executa tarefa todo dia as 6 da manha
		System.out.println("ENTROU INICIAR");
		timer.schedule(new tarefasDiarias(), getAmanha6Am(), delayDiario);
}
	
	private final static long delayDiario = 1000*60*60*24;
	private final static int fONE_DAY = 0;
	private final static int fFOUR_AM = 12;
	private final static int fZERO_MINUTES = 23;

	private static Date getAmanha6Am(){
	  Calendar tomorrow = new GregorianCalendar();
	  tomorrow.add(Calendar.DATE, fONE_DAY);
	  Calendar result = new GregorianCalendar(
	    tomorrow.get(Calendar.YEAR),
	    tomorrow.get(Calendar.MONTH),
	    tomorrow.get(Calendar.DATE),
	    fFOUR_AM,
	    fZERO_MINUTES
	  );
	  return result.getTime();
	}
	
	public static void main(String[] args){
        new AtualizarBanco();
    }
	
	/**
	 * Método para interromper a execução das tarefas.
	 */
	public void parar() {
		timer.cancel();
	}
	/**
	 * Método que contém as tarefas agendadas que serão executadas.
	 */
	class tarefasDiarias extends TimerTask {
		public void run() {
			try {
				System.out.println("teste");
				Dao.truncateTables();
				
				SessoesEReunioesDao sessoesDao = new SessoesEReunioesDao();
				
				sessoesDao.adcionarDataNaTable(ConexaoComWsSessoesEReunioes.adcionarDataNaTable("20/11/2011", "440"));
				sessoesDao.adcionarSessaoNaTable(ConexaoComWsSessoesEReunioes.adcionarSessaoNaTable("20/11/2011"));
				RankingDao rankingDao = new RankingDao();
				Ranking ranking =  RankingControl.gerarRanking
						(RankingControl.gerarListaEstatistica(new DeputadoDao().getDeputados()));
		
				rankingDao.adicionarRankingNaTable(ranking);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ListaRankingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ListaVaziaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}