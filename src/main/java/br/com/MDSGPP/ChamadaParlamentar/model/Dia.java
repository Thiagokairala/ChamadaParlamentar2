package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

public class Dia {
	private String data;
	private ArrayList<String> lista = new ArrayList<String>();
	private String listaDescricaoCompleta;
	
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
	public String getListaDescricaoCompleta() {
		return listaDescricaoCompleta;
	}
	public void setListaDescricaoCompleta(String descricao) {
		this.listaDescricaoCompleta = descricao;
	}
	
	

}
