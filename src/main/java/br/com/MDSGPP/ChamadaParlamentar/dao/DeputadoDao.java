package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;

public class DeputadoDao {

	private Connection conexao;


	public DeputadoDao() throws ClassNotFoundException {
		if(conexao == null) {
			this.conexao = new ConnectionFactory().getConnection();
		}
		
	}

	public void adicionaDeputado(ArrayList<Deputados> deputados) throws SQLException {
		String sql = "insert into deputado(idParlamentar, matricula, ideCadastro, "
				+ "nomeCivil, nomeDeTratamento, sexo, uf, partido"
				+ ", numeroDoGabinete, anexo, telefone, email)" +
				"values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


		PreparedStatement stmt = conexao.prepareStatement(sql);
		for(int i = 0; i<deputados.size(); i++) {
	
			stmt.setInt(1, deputados.get(i).getIdDoParlamentar());
			stmt.setInt(2, deputados.get(i).getMatricula());
			stmt.setInt(3, deputados.get(i).getIdeCadastro());
			stmt.setString(4, deputados.get(i).getNomeCivilDoParlamentar());
			stmt.setString(5, deputados.get(i).getNomeDeTratamentoDoParlamentar());
			stmt.setString(6, deputados.get(i).getSexo());
			stmt.setString(7, deputados.get(i).getUf());
			stmt.setString(8, deputados.get(i).getPartido());
			stmt.setString(9, deputados.get(i).getNumeroDoGabinete());
			stmt.setString(10, deputados.get(i).getAnexo());
			stmt.setString(11, deputados.get(i).getTelefone());
			stmt.setString(12, deputados.get(i).getEmail());

			stmt.execute();

		}
		stmt.close();	
	}

	public ArrayList<String> getNomesDeputados() throws SQLException {
		String sql = "Select * from deputado"; 

		ArrayList<String> lista = new ArrayList<String>();

		PreparedStatement stmt= this.conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		while(rs.next()) {
			String nomeTratamento = rs.getString("nomeDeTratamento");
			String partido = rs.getString("partido");
			String uf = rs.getString("uf");
			
			String montar = nomeTratamento + "-" + partido + "/" + uf;
			lista.add(montar);
		}

		stmt.close();

		return lista;

	}

	public ArrayList<Integer> getMatriculaDeputados() {
		String sql = "Select * from deputado"; //criando o comando sql, procura como buscar uma linha especifica...

		ArrayList<Integer> lista = new ArrayList<Integer>();

		try {
			PreparedStatement stmt= this.conexao.prepareStatement(sql);//criando o prepared statement q é o que vai conetar com o banco
			ResultSet rs = stmt.executeQuery();//executando o stmt para buscar os dados

			while(rs.next()) {
				lista.add(rs.getInt("matricula"));
			}

		} catch (SQLException e) {
			lista.add(0);
			e.printStackTrace();
		}

		return lista;

	}

	public Deputados receberDadosDeputado(String nome) {

		String sql = "select * from deputado where nomeDeTratamento = ?";

		PreparedStatement stmt;
		try {
			stmt = this.conexao.prepareStatement(sql);

			stmt.setString(1, nome);

			ResultSet rs = stmt.executeQuery();

			Deputados deputado = new Deputados(rs.getInt("idParlamentar"), rs.getInt("matricula"),
					rs.getInt("ideCadastro"), rs.getString("nomeCivil"), rs.getString("nomeDeTratamento"),
					rs.getString("sexo"), rs.getString("uf"), rs.getString("partido"),
					rs.getString("numeroDoGabinete"), rs.getString("anexo"), rs.getString("telefone"),
					rs.getString("email"));

			return deputado;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;

		}		
	}
}
