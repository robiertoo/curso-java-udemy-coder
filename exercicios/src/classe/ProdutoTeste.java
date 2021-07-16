package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 4356.89);
		var p2 = new Produto("Caneta Preta", 12.56);
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		Produto.desconto = 0.50;
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("M�dia: %.2f", mediaCarrinho);
	}
}
