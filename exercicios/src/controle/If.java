package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parab�ns");
		} else if(media < 7.0 && media >= 4.5) System.out.println("Recupera��o");
		else System.out.println("Reprovado");
		
			
		entrada.close();
	}
}
