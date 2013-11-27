package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

public class Partidos {
	private String sigla;
	private String nomePartido;
	private ArrayList<Deputados> deputadosDoPartido;
	
	
	
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

	
}
