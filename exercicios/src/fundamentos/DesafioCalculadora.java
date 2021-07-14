package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
 /*
  * Ler num1
  * Ler num2
  * Ler + - * / %
  */
	
	public static void main(String[] args) {
		
		double num1;
		double num2;
		double resultado = 0;
		String operador;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o primeiro dígito: ");
		num1 = Double.parseDouble(entrada.next());

		System.out.println("Insira o segundo dígito: ");
		num2 = Double.parseDouble(entrada.next());
		
		System.out.println("Insira o operador: ");
		operador = entrada.next();
		
		if(operador.equals("+")) resultado = num1 + num2;
		else if(operador.equals("-")) resultado = num1 - num2;
		else if(operador.equals("*")) resultado = num1 * num2;
		else if(operador.equals("/")) resultado = num1 / num2;
		else if(operador.equals("%")) resultado = num1 % num2;
		
		System.out.printf("%f %s %f = %f", num1, operador, num2, resultado);
		
		entrada.close();
	}
	
}
