package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		Produto p2 = new Produto("Borracha", 1.90, 0.15);
		Produto p3 = new Produto("Notebook", 2111.90, 0.15);
		Produto p4 = new Produto("Lapis", 4.90, 0.15);
		Produto p5 = new Produto("CAderno", 20.90, 0.15);
//		imprimir.accept(p1);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		produtos.forEach(imprimir);
		
		produtos.forEach(System.out::println);
	}
}
