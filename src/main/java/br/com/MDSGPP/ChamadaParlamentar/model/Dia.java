package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.exception.ExceptionSessoesEReunioes;

public class Dia {
	private String data;
	private ArrayList<SessoesEReunioes> listaSessoes = new ArrayList<SessoesEReunioes>();
	private int numeroSessoes;

	public String getData() {
		return data;
	}
	public void setData(String data) {
		if(ExceptionSessoesEReunioes.validaData(data)) {
			this.data = data;
		}
		else {
			this.data = null;
		}
	}
	public ArrayList<SessoesEReunioes> getListaSessoes() {
		return listaSessoes;
	}
	public void setListaSessoes(ArrayList<SessoesEReunioes> listaSessoes) {
		this.listaSessoes = listaSessoes;
		if(listaSessoes != null) {
			this.numeroSessoes = listaSessoes.size();
		}
		else {
			this.numeroSessoes = 0;
		}
	}
	public int getNumeroSessoes() {
		return numeroSessoes;
	}
}
