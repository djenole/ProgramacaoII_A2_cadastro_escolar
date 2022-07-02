package testes;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.AlunoDao;
import modelo.Aluno;

public class TestFilterTheListByTheFirstLetterDao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Primeira Letra");
		char pl = sc.next().charAt(0);

		try {
			AlunoDao dao = new AlunoDao();
			List<Aluno> alunos = dao.getFilterTheListByTheFirstLetter(pl);

			for (Aluno aluno : alunos) {
				System.out.println("Nome: "+aluno.getNome());
				System.out.println("Nome: "+aluno.getEmail());
				System.out.println("Nome: "+aluno.getCpf());
				System.out.println("Nome: "+aluno.getDataNasc());
				System.out.println("Nome: "+aluno.getNaturalidade());
				System.out.println("Nome: "+aluno.getEndereco()+"\n");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}