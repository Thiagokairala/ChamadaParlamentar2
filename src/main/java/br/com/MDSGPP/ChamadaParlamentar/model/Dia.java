package br.com.MDSGPP.ChamadaParlamentar.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.com.MDSGPP.ChamadaParlamentar.exception.DataFormatoErradoException;
import br.com.MDSGPP.ChamadaParlamentar.util.VerificarData;

public class Dia {
	private String data;
	private ArrayList<SessoesEReunioes> listaSessoes = new ArrayList<SessoesEReunioes>();
	private int numeroSessoes;

	public String getData() {
		return data;
	}
	public void setData(String data) throws DataFormatoErradoException {
		if(!VerificarData.verificaData(data)) {
			throw new DataFormatoErradoException();
		}
		
		this.data = data;
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
