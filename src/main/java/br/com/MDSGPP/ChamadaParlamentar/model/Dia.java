package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

public class Dia {
	private String data;
	private ArrayList<SessoesEReunioes> listaSessoes = new ArrayList<SessoesEReunioes>();
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public ArrayList<SessoesEReunioes> getListaSessoes() {
		return listaSessoes;
	}
	public void setListaSessoes(ArrayList<SessoesEReunioes> listaSessoes) {
		this.listaSessoes = listaSessoes;
	}
	
	
	

}
