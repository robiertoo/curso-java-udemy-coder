package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/*
 * 1. Usar duas express?es lambdas
 * 2. Usar map
 */

public class DesafioFilter {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Rog?rio", 2, false);
		Funcionario f2 = new Funcionario("Temer", 3, false);
		Funcionario f3 = new Funcionario("Vit?ria", 7, true);
		Funcionario f4 = new Funcionario("Kau?", 1, true);
		Funcionario f5 = new Funcionario("M?rcio", 20, true);
		
		List<Funcionario> funcionarios = Arrays.asList(f1, f2, f3, f4, f5);
		Predicate<Funcionario> insatisfeitos = f -> !f.isSatisfeito();
		Predicate<Funcionario> menosCincoAnosTrabalhando = f -> f.getAnosDeEmpresa() <= 5;
		Function<Funcionario, String> apontarInsatisfeitos = 
				f -> f.getNome() + " est? insatisfeito em seu local de trabalho.";
		
		funcionarios.stream()		
				.filter(insatisfeitos)
				.filter(menosCincoAnosTrabalhando)
				.map(apontarInsatisfeitos)
				.forEach(System.out::println);
	}
}
