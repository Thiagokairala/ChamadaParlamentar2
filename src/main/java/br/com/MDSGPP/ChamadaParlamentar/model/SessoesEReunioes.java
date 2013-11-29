package br.com.MDSGPP.ChamadaParlamentar.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.com.MDSGPP.ChamadaParlamentar.exception.DataFormatoErradoException;

public class SessoesEReunioes {

	private String data;
	private String descricao;
	private String descricaoCompleta;
	private ArrayList<String> deputadosPresentes = new ArrayList<String>();

	private ArrayList<Deputados> deputados = new ArrayList<Deputados>();

	public SessoesEReunioes(String data, 
			String descricao, ArrayList<Deputados> deputados,
			String descricaoCompleta) throws DataFormatoErradoException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		sdf.setLenient(false);

		try {
			Date greg = sdf.parse(data);
		} catch (ParseException e) {
			throw new DataFormatoErradoException();
		}	


		this.data = data;
		this.descricao = descricao;
		this.deputados = deputados;
		this.descricaoCompleta = descricaoCompleta;

	}

	public SessoesEReunioes() {

	}

	public String getData() {
		return data;
	}

	public void setData(String data) throws DataFormatoErradoException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		sdf.setLenient(false);

		try {
			Date greg = sdf.parse(data);
		} catch (ParseException e) {
			throw new DataFormatoErradoException();
		}	

		this.data = data;
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
