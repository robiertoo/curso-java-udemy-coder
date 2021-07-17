package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("quantos alunos?");
		int qtdAlunos = entrada.nextInt();

		System.out.println("quantas notas?");
		int qtdNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];
		double notaTotal = 0;
		
		
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("informe a nota %d do aluno %d", n + 1, a + 1 );
				notasDaTurma[a][n] = entrada.nextDouble();
				notaTotal += notasDaTurma[a][n];
			}
		}
		
		double mediaTotal = notaTotal  / (qtdAlunos * qtdNotas);
		System.out.printf("A média total foi: %.2f", mediaTotal);
		
		entrada.close();
	}
}
