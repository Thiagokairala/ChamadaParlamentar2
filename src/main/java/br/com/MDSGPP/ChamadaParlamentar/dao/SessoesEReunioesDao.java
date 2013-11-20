package br.com.MDSGPP.ChamadaParlamentar.dao;

import java.net.MalformedURLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.rpc.ServiceException;

import br.com.MDSGPP.ChamadaParlamentar.model.Dia;
import br.com.MDSGPP.ChamadaParlamentar.model.SessoesEReunioes;

public class SessoesEReunioesDao extends ConnectionFactory {

	public SessoesEReunioesDao() throws ClassNotFoundException, SQLException {
		new ConnectionFactory().getConnection();
	}

	public void adcionarDataNaTable(ArrayList<String> insert) 
			throws SQLException, MalformedURLException, ServiceException {			     

		for(int i = 0; i <insert.size(); i= i+2) {
			String sql = "insert into datas(datas, sessao) values(?, ?)";

			PreparedStatement stmt;

			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, insert.get(i));
			stmt.setString(2, insert.get(i+1));

			stmt.execute();
			stmt.close();
		}
	}

	public void adcionarSessaoNaTable(ArrayList<String> insert)
			throws SQLException, ClassNotFoundException, MalformedURLException, ServiceException {

		String sql = "insert into sessao(idSessoes, deputadoPresente)values(?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		for(int i = 0; i<insert.size(); i=i+2) {
			stmt.setString(1, insert.get(i));
			stmt.setString(2, insert.get(i+1));

			stmt.execute();
		}
		stmt.close();
	}

	public int passarNumeroDeSessoes() throws SQLException
	{
		String sql = "select * from datas";

		PreparedStatement stmt= ConnectionFactory.conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery(); 
		int i = 0;

		while(rs.next())
		{
			i++;
		}

		return i;		
	}

	public ArrayList<String> procurarSessao(String descricao) throws SQLException {
		String sql = "select * from sessao where idSessoes LIKE ?";

		PreparedStatement stmt = ConnectionFactory.conexao.prepareStatement(sql);

		stmt.setString(1, descricao);
		ResultSet rs = stmt.executeQuery();

		ArrayList<String> lista = new ArrayList<String>();

		while(rs.next()) {
			lista.add(rs.getString("deputadoPresente"));
		}

		return lista;
	}
	
	public Dia procuraDia(String data) throws SQLException{
		Dia dia = new Dia();
		String sql = "select * from datas where datas LIKE ?";
	
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, data);
		ResultSet rs = stmt.executeQuery();
		ArrayList<SessoesEReunioes> lista = new ArrayList<SessoesEReunioes>();

		while(rs.next()){
			SessoesEReunioes sessoes = new SessoesEReunioes();
			sessoes.setDescricao(rs.getString("sessao"));
			sessoes.setDescricaoCompleta(sessoes.getDescricao());
			lista.add(sessoes);
		}
		
		dia.setListaSessoes(lista);
		return dia;
	}
}

