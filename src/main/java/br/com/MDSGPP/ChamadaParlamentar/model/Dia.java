package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

public class Dia {
	String data;
	ArrayList<String> lista = new ArrayList<String>();
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public ArrayList<String> getLista() {
		return lista;
	}
	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}
	
	

}
