package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> itens = new ArrayList<>();
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: this.itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
	
	void adicionarItem(Item item) {
		this.itens.add(item);
	}
	
	void adicionarItem(int quantidade, Produto produto) {
		this.adicionarItem(new Item(quantidade, produto));
	}
	
	void adicionarItem(int quantidade, double preco, String nome) {
		this.adicionarItem(new Item(quantidade, new Produto(nome, preco)));
	}
}
