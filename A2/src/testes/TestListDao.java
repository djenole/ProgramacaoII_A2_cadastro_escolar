package testes;

import java.sql.SQLException;
import java.util.List;

import dao.AlunoDao;
import modelo.Aluno;

public class TestListDao {
	public static void main(String[] args) {
		try {
			AlunoDao adao;
			adao = new AlunoDao();
			List<Aluno> alunos = adao.getList();
		
			for (Aluno aluno : alunos) {
				System.out.println("Nome: "+aluno.getNome());
				System.out.println("Nome: "+aluno.getEmail());
				System.out.println("Nome: "+aluno.getCpf());
				System.out.println("Nome: "+aluno.getDataNasc());
				System.out.println("Nome: "+aluno.getNaturalidade());
				System.out.println("Nome: "+aluno.getEndereco()+"\n");
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}		

	}
}