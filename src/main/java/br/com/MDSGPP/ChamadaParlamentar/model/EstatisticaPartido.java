package br.com.MDSGPP.ChamadaParlamentar.model;

public class EstatisticaPartido {

	private Partidos partido;
	private int quantidadeDeSessoes;
	private int sessoesAssistidas;
	private float porcentagem;
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
	public float getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(float porcentagem) {
		this.porcentagem = porcentagem;
	}	
}
