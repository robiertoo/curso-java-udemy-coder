package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		Produto produto = new Produto("iPad", 3235.89, 0.13);
		
		/*
		 * 1. A partir do produto calcular o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8.5%) < 2500 (Isento)
		 * 3. Frete: >= 3000 (100) < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 */
		
		Function<Produto, Double> calcularPrecoReal = 
				p -> p.preco * (1 - p.desconto);
			
		UnaryOperator<Double> calcularImpostoMunicipal = valor -> {
			double imposto = valor >= 2500 ? valor * 0.085 : 0.0;
			return valor + imposto;
		};
		
		UnaryOperator<Double> calcularFrete = valor -> {
			double frete = valor >= 3000 ? 100.0 : 0.0 ;
			return valor + frete;
		};
		
		Function<Double, String> arredondarValor =
				valor -> String.format("%.2f", valor);
		
		UnaryOperator<String> formatarValor = valor -> "R$" + valor;
		
				
		var resultado = calcularPrecoReal
				.andThen(calcularImpostoMunicipal)
				.andThen(calcularFrete)
				.andThen(arredondarValor)
				.andThen(formatarValor)
				.apply(produto);
		
		System.out.println(resultado);
		
	}
}
