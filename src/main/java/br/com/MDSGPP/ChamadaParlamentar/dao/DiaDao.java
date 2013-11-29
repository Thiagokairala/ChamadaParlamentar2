package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.exception.DataFormatoErradoException;
import br.com.MDSGPP.ChamadaParlamentar.model.Dia;
import br.com.MDSGPP.ChamadaParlamentar.model.SessoesEReunioes;

public class DiaDao extends ConnectionFactory {

	private static final String DATAS = "datas";

	public DiaDao() throws ClassNotFoundException, SQLException {
		new ConnectionFactory().getConnection();
	}

	public ArrayList<Dia> buscarTodasDescricoes() throws SQLException, DataFormatoErradoException {
		ArrayList<Dia> lista = new ArrayList<Dia>();
		String sql = "Select * from datas";

		PreparedStatement stmt= ConnectionFactory.getConexao().prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		lista = criarDias(rs);

		ResultSet rs2 = stmt.executeQuery();

		lista = popularListaDia(rs2, lista);

		rs.close();
		return lista;
	}

	public static ArrayList<Dia> popularListaDia(ResultSet rs, 
			ArrayList<Dia> lista) throws SQLException {
		int cont = 0;

		while(rs.next()) {
			String descricao = rs.getString("sessao");
			String descAux = descricao;
			descricao = descricao.split(" -")[0];

			boolean teste = lista.get(cont).getData().equalsIgnoreCase(rs.getString(DATAS));

			//esse if é igual if(teste == false)
			if(!teste) {
				cont++;
			}
			SessoesEReunioes passar = new SessoesEReunioes();
			passar.setDescricao(descricao);
			passar.setDescricaoCompleta(descAux);
			lista.get(cont).getListaSessoes().add(passar);
		}

		rs.close();
		return lista;
	}

	public static ArrayList<Dia> criarDias(ResultSet rs) 
			throws SQLException, DataFormatoErradoException {
		ArrayList<Dia> lista = new ArrayList<Dia>();

		int controle = 0;

		while(rs.next()) {
			if(lista.size() == 0) {
				Dia dia = new Dia();
				dia.setData(rs.getString(DATAS));
				lista.add(dia);
			}
			else {
				boolean teste = lista.get(controle).getData().equals(rs.getString(DATAS));
				//esse if é equivalente if(teste == false)
				if(!teste) {
					Dia diaAux = new Dia();
					diaAux.setData(rs.getString(DATAS));
					lista.add(diaAux);
					controle++;
				}
			}
		}

		rs.close();
		return lista;
	}

}
