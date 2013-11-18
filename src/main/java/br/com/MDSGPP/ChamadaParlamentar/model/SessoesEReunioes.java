package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.exception.ExceptionSessoesEReunioes;

public class SessoesEReunioes {

	private String data;
	private String descricao;
	private String descricaoCompleta;
	private ArrayList<String> deputadosPresentes = new ArrayList<String>();

	private ArrayList<Deputados> deputados = new ArrayList<Deputados>();

	public SessoesEReunioes(String data, 
			String descricao, ArrayList<Deputados> deputados,
			String descricaoCompleta) {
		if(ExceptionSessoesEReunioes.validaData(data)) {
			this.data = data;
			this.descricao = descricao;
			this.deputados = deputados;
			this.descricaoCompleta = descricaoCompleta;
		}
		else {
			this.data = null;
			this.descricao = null;
			this.deputados = null;
		}
	}

	public SessoesEReunioes() {

	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		if(ExceptionSessoesEReunioes.validaData(data)){
			this.data = data;
		}
		else {
			this.data = null;
		}
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

	public String getDescricaoCompleta() {
		return descricaoCompleta;
	}

	public void setDescricaoCompleta(String descricaoCompleta) {
		this.descricaoCompleta = descricaoCompleta;
	}

	public ArrayList<String> getDeputadosPresentes() {
		return deputadosPresentes;
	}

	public void setDeputadosPresentes(ArrayList<String> deputadosPresentes) {
		this.deputadosPresentes = deputadosPresentes;
	}
}
