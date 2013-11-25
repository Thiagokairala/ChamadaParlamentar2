package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

public class Estatistica {

	private String nome;
	private String numeroSessao;
	private String totalSessao;
	private String porcentagem;
	private ArrayList<String> lista = new ArrayList<String>(); 

//construtor
	
	public Estatistica(){
		
	}


	public String getNumeroSessao() {
		return numeroSessao;
	}

	public void setNumeroSessao(String numeroSessao) {
		this.numeroSessao = numeroSessao;
	}

	public String getTotalSessao() {
		return totalSessao;
	}

	public void setTotalSessao(String totalSessao) {
		this.totalSessao = totalSessao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(String porcentagem) {
		this.porcentagem = porcentagem;
	}

	public ArrayList<String> getLista() {
		return lista;
	}

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}
}


