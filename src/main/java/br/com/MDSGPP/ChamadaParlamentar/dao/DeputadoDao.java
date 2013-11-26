package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;

public class DeputadoDao extends ConnectionFactory {

	private final int UM = 1;
	private final int DOIS = 2;
	private final int TRES = 3;
	private final int QUATRO = 4;
	private final int CINCO = 5;
	private final int SEIS = 6;
	private final int SETE = 7;
	private final int OITO = 8;
	private final int NOVE = 9;
	private final int DEZ = 10;
	private final int ONZE = 11;
	private final int DOZE = 12;
		
	public DeputadoDao() throws ClassNotFoundException, SQLException {
		new ConnectionFactory().getConnection();
	}

	public void adicionaDeputado(ArrayList<Deputados> deputados) throws SQLException {
		String sql = "insert into deputado(idParlamentar, matricula, ideCadastro, "
				+ "nomeCivil, nomeDeTratamento, sexo, uf, partido"
				+ ", numeroDoGabinete, anexo, telefone, email)" +
				"values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement stmt = getConexao().prepareStatement(sql);
		for(int i = 0; i<deputados.size(); i++) {

			stmt.setInt(UM, deputados.get(i).getIdDoParlamentar());
			stmt.setInt(DOIS, deputados.get(i).getMatricula());
			stmt.setInt(TRES, deputados.get(i).getIdeCadastro());
			stmt.setString(QUATRO, deputados.get(i).getNomeCivilDoParlamentar());
			stmt.setString(CINCO, deputados.get(i).getNomeDeTratamentoDoParlamentar());
			stmt.setString(SEIS, deputados.get(i).getSexo());
			stmt.setString(SETE, deputados.get(i).getUf());
			stmt.setString(OITO, deputados.get(i).getPartido());
			stmt.setString(NOVE, deputados.get(i).getNumeroDoGabinete());
			stmt.setString(DEZ, deputados.get(i).getAnexo());
			stmt.setString(ONZE, deputados.get(i).getTelefone());
			stmt.setString(DOZE, deputados.get(i).getEmail());

			stmt.execute();

		}
		stmt.close();	
	}
	//esse método será utilizado para o autocomplete
	public ArrayList<String> getNomesDeputados() throws SQLException {
		String sql = "Select * from deputado"; 

		ArrayList<String> lista = new ArrayList<String>();

		PreparedStatement stmt= ConnectionFactory.getConexao().prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		while(rs.next()) {
			String nomeCivil = rs.getString("nomeCivil");
			String nomeTratamento = rs.getString("nomeDeTratamento");
			lista.add(nomeCivil);
			lista.add(nomeTratamento);
		}

		rs.close();
		stmt.close();

		
		return lista;

	}

	public ArrayList<Integer> getMatriculaDeputados() throws SQLException {
		//criando o comando sql, procura como buscar uma linha especifica...
		String sql = "Select * from deputado";

		ArrayList<Integer> lista = new ArrayList<Integer>();

		//criando o prepared statement q é o que vai conetar com o banco
		PreparedStatement stmt= ConnectionFactory.getConexao().prepareStatement(sql);
		//executando o stmt para buscar os dados
		ResultSet rs = stmt.executeQuery();

		while(rs.next()) {
			lista.add(rs.getInt("matricula"));
		}


		rs.close();
		return lista;
	}

	public ArrayList<Deputados> getDeputados() throws SQLException {
		String sql = "Select * from deputado";
		ArrayList<Deputados> lista = new ArrayList<Deputados>();

		PreparedStatement stmt = ConnectionFactory.getConexao().prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while(rs.next()) {
			Deputados deputado = new Deputados();

			deputado.setIdDoParlamentar(rs.getInt("idParlamentar"));
			deputado.setMatricula(rs.getInt("matricula"));
			deputado.setIdeCadastro(rs.getInt("ideCadastro"));
			deputado.setNomeCivilDoParlamentar(rs.getString("nomeCivil"));
			deputado.setNomeDeTratamentoDoParlamentar(rs.getString("nomeDeTratamento"));
			deputado.setSexo(rs.getString("sexo"));		
			deputado.setUf(rs.getString("uf"));
			deputado.setPartido(rs.getString("partido"));
			deputado.setNumeroDoGabinete(rs.getString("numeroDoGabinete"));
			deputado.setAnexo(rs.getString("anexo"));
			deputado.setTelefone(rs.getString("telefone"));
			deputado.setEmail(rs.getString("email"));

			lista.add(deputado);
		}

		rs.close();
		return lista;
	}
}
