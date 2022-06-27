package dao;

import java.sql.PreparedStatement;

import modelo.Aluno;

public class AlunoDao {
//	Connection con;

//	AlunoDao() throws SQLException {
//	con = Factory.getConnection();
	
	public void inser(Aluno aluno) {
		String query = "insert into aluno (nome, email, cpf, dataNasc, naturalidade, endereco) values (?,?,?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(query);
		stmt.setString(aluno.getNome());
		stmt.setString(aluno.getEmail());
		stmt.setString(aluno.getCpf());
		stmt.setString(aluno.getDataNasc());
		stmt.setString(aluno.getNaturalidade());
		stmt.setString(aluno.getEndereco());
		stmt.execute();
		stmt.close();
		con.close();
		
	
	}

}
