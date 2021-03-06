package oo.composicao.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Roberto");
		
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		Produto produto1 = new Produto("Joystick", 249.99);
		Produto produto2 = new Produto("Teclado / Mouse s/ fio", 149.99);
		
		compra1.adicionarItem(1, produto1);
		compra1.adicionarItem(3, 1.50, "Caneta Bic");
		compra2.adicionarItem(new Item(2, produto1));
		compra2.adicionarItem(new Item(2, produto2));
		
		System.out.println("Compra 1: " + compra1.obterValorTotal());
		System.out.println("Compra 2: " + compra2.obterValorTotal());
		
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		
		System.out.println("Total de Compras: " + cliente1.obterValorTotal());
	}
}
