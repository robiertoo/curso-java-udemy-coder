package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	/*
	 * domingo -> 1
	 * quarta -> 4
	 * sexta -> 6
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o n?mero da semana:");
		int numero = entrada.nextInt();
		String dia;
		
		if(numero < 1 || numero > 7) dia = "N?mero inv?lido!";
		else if(numero == 1) dia = "Domingo";
		else if(numero == 2) dia = "Segunda";
		else if(numero == 3) dia = "Ter?a";
		else if(numero == 4) dia = "Quarta";
		else if(numero == 5) dia = "Quinta";
		else if(numero == 6) dia = "Sexta";
		else dia = "S?bado";
		
		System.out.printf("Dia da semana: %s", dia);
		
		entrada.close();
	}
}
