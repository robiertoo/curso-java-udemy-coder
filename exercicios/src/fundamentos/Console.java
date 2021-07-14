package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia");
		
		System.out.println("Bom");
		System.out.println("Dia");
		
		System.out.printf("Megasena %d %d %d %d %n", 1,2,3,4);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: \n");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome: \n");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: \n");
		int idade = entrada.nextInt();
		
		System.out.printf("Nome: %s %s %d", nome, sobrenome, idade)	;
		
		entrada.close();
	}
}
