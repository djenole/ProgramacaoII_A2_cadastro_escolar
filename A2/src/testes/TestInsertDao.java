package testes;

import java.sql.Date;
import java.sql.SQLException;

import dao.AlunoDao;
import modelo.Aluno;

public class TestInsertDao {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		String nome = "Djenole";
		String email = "email@email.com";
		String cpf = "2314312323";
		String dataNac = "12/12/2020";
		String naturalidade = "carioca";
		String endereco = "ruazinha";
		
		
		a1.setNome(nome);
		a1.setEmail(email);
		a1.setCpf(cpf);
		a1.getDataNasc();
		a1.getNaturalidade()
		a1.setEndereco(endereco);
		
		AlunoDao adao;
		try {
			adao = new AlunoDao();
			adao.insert(a1);
			System.out.println("um novo Aluno salvo com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}
