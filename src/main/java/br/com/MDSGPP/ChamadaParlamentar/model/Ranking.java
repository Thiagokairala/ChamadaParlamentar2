package br.com.MDSGPP.ChamadaParlamentar.model;

import java.util.ArrayList;

public class Ranking {

	private ArrayList<Estatistica> lista = new ArrayList<Estatistica>();
	private ArrayList<Estatistica> removidos = new ArrayList<Estatistica>();
	private ArrayList<Estatistica> melhores = new ArrayList<Estatistica>();
	private ArrayList<Estatistica> piores = new ArrayList<Estatistica>();
	
	public Ranking() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Estatistica> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Estatistica> lista) {
		this.lista = lista;
	}

	public ArrayList<Estatistica> getRemovidos() {
		return removidos;
	}

	public void setRemovidos(ArrayList<Estatistica> removidos) {
		this.removidos = removidos;
	}

	public ArrayList<Estatistica> getMelhores() {
		return melhores;
	}

	public void setMelhores(ArrayList<Estatistica> melhores) {
		this.melhores = melhores;
	}

	public ArrayList<Estatistica> getPiores() {
		return piores;
	}

	public void setPiores(ArrayList<Estatistica> piores) {
		this.piores = piores;
	}
}
