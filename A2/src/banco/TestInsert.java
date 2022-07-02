package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestInsert {
	public static void main(String[] args) {
		try {
			String insert = "insert into alunos (nome, email, cpf, dataNasc, naturalidade, endereco) values (?, ?, ?, ?, ?, ?)";
			Connection con = Factory.getConnection();
			PreparedStatement stmt = con.prepareStatement(insert);
			stmt.setString(1, "Genin");
			stmt.setString(2, "email@email.com");
			stmt.setString(3, "00452014");
			stmt.setDate(4, null);
			stmt.setString(5, "carioca");
			stmt.setString(6,"ruazinha 1234");
			stmt.execute();
			stmt.close();
			System.out.println("aluno gravado com sucesso");
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
