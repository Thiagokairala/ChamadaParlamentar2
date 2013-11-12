package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

public class Ranking {

	private ArrayList<Estatistica> lista = new ArrayList<Estatistica>();
	public Ranking() {
		// TODO Auto-generated constructor stub
	}
	public Ranking(ArrayList<Estatistica> lista) {
		this.lista = lista;
	}
	public ArrayList<Estatistica> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Estatistica> lista) {
		this.lista = lista;
	}

	
}
