package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "Joao Pedro";
		compra1.adicionarItem("Batata", 1, 2.50);
		compra1.adicionarItem("caneta", 3, 1.50);
		compra1.adicionarItem(new Item("borracha", 1, 0.50));
		
		System.out.println(compra1.itens.size());
		for(Item item : compra1.itens) {
			System.out.println(item.nome);
		}
		
		System.out.println(compra1.getValorTotal());		
	}
}
