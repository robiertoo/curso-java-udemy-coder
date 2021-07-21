package excecao;

public class Basico {
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			ImprimirNomeDoAluno(a1);			
		} catch(Exception excecao) {
			System.out.println("ocorreu um erro no momento de imprimir o nome do aluno");;
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("ocorreu o erro: " + e.getMessage());
		}
		
		System.out.println("Fim.");
	}
	
	public static void ImprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
