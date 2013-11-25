package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

public class Estatistica {

	private String nome;
	private String nomePassado;
	private String NumeroSessao;
	private String TotalSessao;
	private String porcentagem;
	private ArrayList<String> Lista = new ArrayList<String>(); 

//construtor
	
	public Estatistica(){
		
	}


	public String getNumeroSessao() {
		return NumeroSessao;
	}

	public void setNumeroSessao(String numeroSessao) {
		NumeroSessao = numeroSessao;
	}

	public String getTotalSessao() {
		return TotalSessao;
	}

	public void setTotalSessao(String totalSessao) {
		TotalSessao = totalSessao;
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
		return Lista;
	}

	public void setLista(ArrayList<String> lista) {
		Lista = lista;
	}


	public String getNomePassado() {
		return nomePassado;
	}


	public void setNomePassado(String nomePassado) {
		this.nomePassado = nomePassado;
	}

	
	
}


