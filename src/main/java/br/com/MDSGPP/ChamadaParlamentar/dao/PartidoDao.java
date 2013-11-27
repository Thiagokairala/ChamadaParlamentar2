package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.MDSGPP.ChamadaParlamentar.model.Partidos;

public class PartidoDao extends ConnectionFactory {

	private final int UM = 1;
	private final int DOIS = 2;

	public PartidoDao() throws ClassNotFoundException, SQLException {
		new ConnectionFactory().getConnection();
	}

	public void adicionarPartidoNaTable (ArrayList<Partidos> lista)
			throws SQLException {
		String sql = "insert into partido(sigla, nomePartido)values(?, ?)";

		PreparedStatement stmt = getConexao().prepareStatement(sql);

		for(int i = 0; i<lista.size(); i++) {
			stmt.setString(UM, lista.get(i).getSigla());
			stmt.setString(DOIS, lista.get(i).getNomePartido());

			stmt.execute();
		}

		stmt.close();
	}
}
