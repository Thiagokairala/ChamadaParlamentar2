package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

public class Dia {
	private String data;
	private ArrayList<String> lista = new ArrayList<String>();
	private	ArrayList<String> listaDescricaoCompleta = new ArrayList<String>();
	
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
	public ArrayList<String> getListaDescricaoCompleta() {
		return listaDescricaoCompleta;
	}
	public void setListaDescricaoCompleta(ArrayList<String> descricao) {
		this.listaDescricaoCompleta = descricao;
	}
	
	

}
