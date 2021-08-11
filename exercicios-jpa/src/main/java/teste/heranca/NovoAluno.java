package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.Bolsista;

public class NovoAluno {
	public static void main(String[] args) {
		DAO<Aluno> alunoDao = new DAO<>();
		Aluno aluno1 = new Aluno(123L, "João");
		Bolsista aluno2 = new Bolsista(1000, 345L, "Maria");
		
		alunoDao.incluirAtomico(aluno1);
		alunoDao.incluirAtomico(aluno2);
		
		alunoDao.fecharDAO();
	}
}
