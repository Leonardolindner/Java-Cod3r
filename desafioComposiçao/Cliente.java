package desafioComposiçao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	
	final List<Compras> compras = new ArrayList<Compras>();
	
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compras compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compras compra: compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}
}
