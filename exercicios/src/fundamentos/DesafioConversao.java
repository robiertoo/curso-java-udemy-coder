package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	/*
	 * scanner
	 * salarios
	 * media
	 * virgula ou ponto
	 */
	
	static double[] pegarSalarios() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro sal?rio: ");
		double salario1 = Double.parseDouble(entrada.next().replace(",", "."));
		System.out.println("Digite o segundo sal?rio: ");
		double salario2 = Double.parseDouble(entrada.next().replace(",", "."));
		System.out.println("Digite o terceiro sal?rio: ");
		double salario3 = Double.parseDouble(entrada.next().replace(",", "."));
		
		double salarios [] = { salario1, salario2, salario3 };
		
		entrada.close();
		
		return salarios;
	}
	
	static double gerarMediaDeSalarios(double [] salarios) {
		double total = 0.0;
		
		for(double salario : salarios) {
			total += salario;
		}
		
		return total / 3;
	}
	
	
	public static void main(String[] args) {
		double salarios[] = pegarSalarios();
		double media = gerarMediaDeSalarios(salarios);
		System.out.println("A m?dia de sal?rios ?: " + media);
		
	}
	
	
	
}
