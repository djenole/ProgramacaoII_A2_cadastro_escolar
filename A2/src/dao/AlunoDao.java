package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

}
