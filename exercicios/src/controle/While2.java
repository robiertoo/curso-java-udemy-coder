package controle;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("Sair")) {
			System.out.println("Digite algo: ");
			valor = entrada.nextLine();
		}
		
		entrada.close();
	}
}
