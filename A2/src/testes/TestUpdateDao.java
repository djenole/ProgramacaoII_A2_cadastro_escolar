package testes;

import java.util.List;
import java.util.Scanner;

import dao.AlunoDao;
import modelo.Aluno;

public class TestUpdateDao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
	
		System.out.println("Primeira Letra");
		Long id = Long.parseLong(sc.nextLine());
	
	
	
		try {
			AlunoDao alunoDao = new AlunoDao();
			List<Aluno> alunos = alunoDao.searchForId(id);
		
			for (Aluno nomeContato : alunos) {
				System.out.println("Nome: "+nomeContato.getNome()+"\nEmail"+nomeContato.getEmail()+"\nEndereço:"+nomeContato.getEndereco());
				System.out.println("_");
				}
		
		} catch (Exception e) {
			e.printStackTrace();
			}
	
		System.out.println("Digite o novo nome:");
		String nome = sc.nextLine();
	
		System.out.println("Digite o novo email:");
		String email = sc.nextLine();
	
		System.out.println("Digite o novo endereco:");
		String endereco = sc.nextLine();
	
		aluno.setNome(nome);
		aluno.setEmail(email);
		aluno.setEndereco(endereco);

		try {
			AlunoDao alunoDao = new AlunoDao();
			alunoDao.updateAluno(aluno, id);
			System.out.println("ok");
		
			List<Aluno> alunos = alunoDao.getList();
			for (Aluno nomeAluno : alunos) {
				System.out.println("Nome: "+nomeAluno.getNome()+"\nEmail"+nomeAluno.getEmail()+"\nEndereço:"+nomeAluno.getEndereco());
				System.out.println("_");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}	
		sc.close();
	}
}