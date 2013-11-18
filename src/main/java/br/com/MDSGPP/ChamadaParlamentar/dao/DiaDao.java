package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.model.Dia;
import br.com.MDSGPP.ChamadaParlamentar.model.SessoesEReunioes;

public class DiaDao extends ConnectionFactory {

	public DiaDao() throws ClassNotFoundException, SQLException {
		new ConnectionFactory().getConnection();
	}

	public ArrayList<Dia> buscarTodasDescricoes() throws SQLException {
		ArrayList<Dia> lista = new ArrayList<Dia>();
		String sql = "Select * from datas";

		PreparedStatement stmt= ConnectionFactory.conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		lista = criarDias(rs);

		ResultSet rs2 = stmt.executeQuery();

		lista = popularListaDia(rs2, lista);

		return lista;
	}

	public static ArrayList<Dia> popularListaDia(ResultSet rs, 
			ArrayList<Dia> lista) throws SQLException {
		int cont = 0;

		while(rs.next()) {
			String descricao = rs.getString("sessao");
			String descAux = descricao;
			descricao = descricao.split(" -")[0];

			if(lista.get(cont).getData().equalsIgnoreCase(rs.getString("datas"))== false) {
				cont++;
			}
			SessoesEReunioes passar = new SessoesEReunioes();
			passar.setDescricao(descricao);
			passar.setDescricaoCompleta(descAux);
			lista.get(cont).getListaSessoes().add(passar);
		}

		return lista;
	}

	public static ArrayList<Dia> criarDias(ResultSet rs) throws SQLException {
		ArrayList<Dia> lista = new ArrayList<Dia>();

		int controle = 0;

		while(rs.next()) {
			if(lista.size() == 0) {
				Dia dia = new Dia();
				dia.setData(rs.getString("datas"));
				lista.add(dia);
			}
			else {
				if(lista.get(controle).getData().equalsIgnoreCase
						(rs.getString("datas")) == false) {
					Dia diaAux = new Dia();
					diaAux.setData(rs.getString("datas"));
					lista.add(diaAux);
					controle++;
				}			
			}
		}

		return lista;
	}

}
