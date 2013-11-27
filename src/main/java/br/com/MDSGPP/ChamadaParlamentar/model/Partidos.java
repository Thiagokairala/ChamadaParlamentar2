package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

public class Partidos {
	private String sigla;
	private String nomePartido;
	private ArrayList<Deputados> deputadosDoPartido;
	private ArrayList<Estatistica> estatisticaDosDeputados;
	private ArrayList<Estatistica> deputadosSemDados;
	
	public String getNomePartido() {
		return nomePartido;
	}
	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public ArrayList<Deputados> getDeputadosDoPartido() {
		return deputadosDoPartido;
	}
	public void setDeputadosDoPartido(ArrayList<Deputados> deputadosDoPartido) {
		this.deputadosDoPartido = deputadosDoPartido;
	}
	public ArrayList<Estatistica> getEstatisticaDosDeputados() {
		return estatisticaDosDeputados;
	}
	public void setEstatisticaDosDeputados(
			ArrayList<Estatistica> estatisticaDosDeputados) {
		this.estatisticaDosDeputados = estatisticaDosDeputados;
	}
	public ArrayList<Estatistica> getDeputadosSemDados() {
		return deputadosSemDados;
	}
	public void setDeputadosSemDados(ArrayList<Estatistica> deputadosSemDados) {
		this.deputadosSemDados = deputadosSemDados;
	}
	
	
}
