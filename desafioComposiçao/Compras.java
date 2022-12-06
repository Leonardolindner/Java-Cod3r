package desafioComposiçao;

import java.util.ArrayList;
import java.util.List;

public class Compras {

	final List<Item> itens = new ArrayList<>();
	
	void adicionaritem(Produtos p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	void adicionaritem(String nome, double preco, int quantidade) {
		var produto = new Produtos(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
	
	
}