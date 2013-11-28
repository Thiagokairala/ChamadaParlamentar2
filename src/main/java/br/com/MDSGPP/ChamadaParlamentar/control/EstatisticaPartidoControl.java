package br.com.MDSGPP.ChamadaParlamentar.control;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import br.com.MDSGPP.ChamadaParlamentar.model.EstatisticaPartido;
import br.com.MDSGPP.ChamadaParlamentar.model.Partidos;

public class EstatisticaPartidoControl {
	public static EstatisticaPartido gerarEstatisticaPartido(String nome) 
			throws ClassNotFoundException, SQLException {
		EstatisticaPartido estatistica = new EstatisticaPartido();
		
		Partidos partido = PartidoControl.passarPartidoComDadosCompletos(nome);
		estatistica.setPartido(partido);
		
		int totalDeSessoes = 0;
		int totalDeSessoesAssistidas = 0;
		for(int i = 0; i<partido.getEstatisticaDosDeputados().size(); i++) {
			totalDeSessoes += Integer.parseInt(partido.getEstatisticaDosDeputados().get(i).getTotalSessao());
			totalDeSessoesAssistidas += Integer.parseInt(partido.getEstatisticaDosDeputados().get(i).getNumeroSessao());
		}
		
		double porcentagem = (((double)(totalDeSessoesAssistidas))/((double)totalDeSessoes))*100.0;
		
		String porcentagemAPassar = formatarNumeroDouble(porcentagem);
		
		estatistica.setPorcentagem(porcentagemAPassar);
		estatistica.setQuantidadeDeSessoes(totalDeSessoes);
		estatistica.setSessoesAssistidas(totalDeSessoesAssistidas);
		return estatistica;	
	}
	
	public static String formatarNumeroDouble(double numero) {
		NumberFormat formatardouble= new DecimalFormat("0.00");    
		
		return formatardouble.format(numero);
	}
}
