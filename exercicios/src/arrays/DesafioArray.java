package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de notas que deseja inserir: ");
		int tamanho = entrada.nextInt();
		
		System.out.println();
		
		double[] notas = new double [tamanho];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Insira a %dª nota: ", i + 1);
			notas[i] = entrada.nextDouble();
			System.out.println();
		}		
		
		double total = 0;
		
		for(double nota : notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.printf("A média das notas foi: %.2f", media);
		
		entrada.close();
	}
}
