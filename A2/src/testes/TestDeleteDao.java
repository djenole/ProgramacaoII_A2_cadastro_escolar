package testes;

import dao.AlunoDao;

public class TestDeleteDao {
	public static void main(String[] args) {
		try {
			AlunoDao alunoDao;
			alunoDao = new AlunoDao();
			alunoDao.delete(1L);
			System.out.println("deletado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
