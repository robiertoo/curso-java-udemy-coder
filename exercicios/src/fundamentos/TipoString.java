package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá PEssoal!".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(
				s.concat(", senhora")
				.concat("!!")
				.toLowerCase()
				.replace("a", "x")
		);
		
		String olar = "Bom dIa";
		System.out.println(olar.equals("bom dia"));
		System.out.println(olar.equalsIgnoreCase("bom dia"));
		
		String nome = "Roberto";
		String sobrenome = "Maciel";
		int idade = 24;
		double salario = 2208.00;
		
		System.out.printf("Nome: %s %s, Idade: %d, Salário: %.2f \n", 
				nome, sobrenome, idade, salario);
		
		String frase = String.format("Nome: %s %s, Idade: %d, Salário: %.2f", 
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		
	}
}
