package controle;

import java.util.Scanner;

public class DesafioWhile {
	/*
	 * Media nota turma
	 * varios alunos
	 * digita nota valida -> total
	 * sair -1
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int contador = 0;
		double total = 0;
		double nota = 0;
		
		while(nota != -1) {
			System.out.println("Digite sua nota: ");
			nota = entrada.nextDouble();
			if(nota < -1 || nota > 10) System.out.println("Digite um n�mero v�lido!");
			else if(nota != -1){
				total += nota;
				contador++;
			}
		}
		
		System.out.printf("A m�dia de %d alunos foi %f", contador, total / contador);
		
		entrada.close();
	}
}
