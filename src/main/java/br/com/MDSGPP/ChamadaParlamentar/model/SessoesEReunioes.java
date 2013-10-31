package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

public class SessoesEReunioes {
	
	private String data;
	private String descricao;
	
	private ArrayList<Deputados> deputados = new ArrayList<Deputados>();

	public SessoesEReunioes(String data, String descricao, ArrayList<Deputados> deputados) {
		this.data = data;
		this.descricao = descricao;
		this.deputados = deputados;
	}
	
	public SessoesEReunioes() {
		
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<Deputados> getDeputados() {
		return deputados;
	}

	public void setDeputados(ArrayList<Deputados> deputados) {
		this.deputados = deputados;
	}
	
	

}
