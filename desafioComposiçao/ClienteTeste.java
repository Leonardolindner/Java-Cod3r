package desafioComposiçao;

public class ClienteTeste {
	public static void main(String[] args) {
		 
		
		Compras compra1 = new Compras();
		compra1.adicionaritem("Caneta", 9.57, 100);;
		compra1.adicionaritem(new Produtos("notebook", 1897.88), 2);
		
		Compras compra2 = new Compras();
		compra2.adicionaritem("Caderno", 10.0, 10);;
		compra2.adicionaritem(new Produtos("impressora", 998.90), 1);
		
		Cliente cliente1 = new Cliente(" Beto");
		cliente1.adicionarCompra(compra1);
		cliente1.compras.add(compra2);
		
		System.out.println(cliente1.obterValorTotal());
	}

}
