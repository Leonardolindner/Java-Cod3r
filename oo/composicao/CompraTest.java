package oo.composicao;

public class CompraTest {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "maria luiza";
		compra1.itens.add(new Item("caneta", 20, 7.45));
		compra1.itens.add(new Item("borracha", 12, 3.09));
		compra1.itens.add(new Item("caderno", 3, 18.09));
		
		System.out.println(compra1.itens.size());
	}
}

