package br.com.MDSGPP.ChamadaParlamentar.model;

public class EstatisticaPartido {

	private Partidos partido;
	private int quantidadeDeSessoes;
	private int sessoesAssistidas;
	private String porcentagem;
	public Partidos getPartido() {
		return partido;
	}
	public void setPartido(Partidos partido) {
		this.partido = partido;
	}
	public int getQuantidadeDeSessoes() {
		return quantidadeDeSessoes;
	}
	public void setQuantidadeDeSessoes(int quantidadeDeSessoes) {
		this.quantidadeDeSessoes = quantidadeDeSessoes;
	}
	public int getSessoesAssistidas() {
		return sessoesAssistidas;
	}
	public void setSessoesAssistidas(int sessoesAssistidas) {
		this.sessoesAssistidas = sessoesAssistidas;
	}
	public String getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(String porcentagem) {
		this.porcentagem = porcentagem;
	}	
}
