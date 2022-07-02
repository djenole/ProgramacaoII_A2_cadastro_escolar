package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import banco.Factory;
import modelo.Aluno;


public class AlunoDao {
	private Connection con;

	public AlunoDao() throws SQLException {
		con = Factory.getConnection();
	}
	
	public void insert(Aluno aluno) throws SQLException {
		String query = "insert into aluno (nome, email, cpf, dataNasc, naturalidade, endereco) values (?,?,?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(query);
		stmt.setString(1, aluno.getNome());
		stmt.setString(2, aluno.getEmail());
		stmt.setString(3, aluno.getCpf());
		stmt.setString(4, aluno.getDataNasc());
		stmt.setString(5, aluno.getNaturalidade());
		stmt.setString(6, aluno.getEndereco());
		stmt.execute();
		stmt.close();
		con.close();
	}
	
	public List<Aluno> getList() throws SQLException{
		String query = "select * from alunos";
		PreparedStatement stmt = con.prepareStatement(query);
		ResultSet rset = stmt.executeQuery();
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		while(rset.next()) {
			Aluno aluno = new Aluno();
			aluno.setNome(rset.getString("nome"));
			aluno.setEmail(rset.getString("email"));
			aluno.setCpf(rset.getString("CPF"));
			aluno.setDataNasc(rset.getString(""));
			aluno.setNaturalidade(rset.getString("naturalidade"));
			aluno.setEndereco(rset.getString("endereco"));
			alunos.add(aluno);
		}
		rset.close();
		stmt.close();
		con.close();
		
		return alunos;
		
	}
	
	public List<Aluno> getFilterTheListByTheFirstLetter(char letra) throws SQLException {
		String query = "select * from contatos where nome like '"+letra+"%'";
		PreparedStatement stmt = con.prepareStatement(query);
		ResultSet rset = stmt.executeQuery();
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		while(rset.next()) {
			Aluno aluno = new Aluno();
			aluno.setNome(rset.getString("nome"));
			aluno.setEmail(rset.getString("email"));
			aluno.setCpf(rset.getString("cpf"));
			aluno.setDataNasc(rset.getString(""));
			aluno.setNaturalidade(rset.getString("naturalidade"));
			aluno.setEndereco(rset.getString("endereco"));
			
			alunos.add(aluno);
		}
		rset.close();
		stmt.close();
		con.close();
		
		return alunos;
	}
	
	
	public List<Aluno> searchForId(Long id) throws SQLException {
		String query = "select * from alunos where nome id = "+id+"";
		PreparedStatement stmt = con.prepareStatement(query);
		ResultSet rset = stmt.executeQuery();
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		while(rset.next()) {
			Aluno aluno = new Aluno();
			aluno.setNome(rset.getString("nome"));
			aluno.setEmail(rset.getString("email"));
			aluno.setCpf(rset.getString("cpf"));
			aluno.setDataNasc(rset.getString(""));
			aluno.setNaturalidade(rset.getString("naturalidade"));
			aluno.setEndereco(rset.getString("endereco"));
			
			alunos.add(aluno);
		}
		
		rset.close();
		stmt.close();
		con.close();
		
		return alunos;
	}
	
	
	public void updateAluno(Aluno aluno, Long id) throws SQLException {
		String sql = "UPDATE CONTATOS SET NOME = ?, EMAIL = ?, CPF = ?, DATA = ?, NATURALIDADE = ?, ENDERECO = ? WHERE ID = "+id+"";
		
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		
		preparedStatement.setString(1, aluno.getNome());
		preparedStatement.setString(2, aluno.getEmail());
		preparedStatement.setString(3, aluno.getCpf());
		preparedStatement.setString(4, aluno.getDataNasc());
		preparedStatement.setString(5, aluno.getNaturalidade());
		preparedStatement.setString(6, aluno.getEndereco());
		preparedStatement.execute();
		preparedStatement.close();		
	}
	
	

	public void delete(Long id) throws SQLException {
		String sql = "delete from alunos where id = "+id+"";
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.execute();
		preparedStatement.close();
		con.close();
	}
	
	

}
