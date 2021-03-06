package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilterSite {
	public static void main(String[] args) {
		Produto p1 = new Produto("PS4", 0.35, false);
		Produto p2 = new Produto("XBOX SERIES X", 0.25, true);
		Produto p3 = new Produto("PC GAMER", 0.31, true);
		Produto p4 = new Produto("HEADSET", 0.15, true);
		Produto p5 = new Produto("TECLADO MEC?NICO", 0.50, true);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		Predicate<Produto> descontoMaior30 = p -> p.getDesconto() >= 0.30;
		Predicate<Produto> temFreteGratis = p -> p.isFreteGratis();
		Function<Produto, String> apresentaItensFiltrados = 
				p -> "O produto " + p.getNome() + " possui frete gr?tis e est? com mais de 30% de desconto!";
		
		produtos.stream()
				.filter(temFreteGratis)
				.filter(descontoMaior30)
				.map(apresentaItensFiltrados)
				.forEach(System.out::println);
	}
}
