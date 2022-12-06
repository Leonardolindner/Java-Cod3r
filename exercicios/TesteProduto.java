package exercicios;

public class TesteProduto {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "notebook";
		p1.preço = 4846.68;
		p1.desconto = 0.29;
		double preçoFinal1 = p1.preçoComDesconto();
		
		
		Produto p2 = new Produto();
		p2.nome = "caneta preta";
		p2.preço = 12.89;
		p2.desconto = 0.27;
		double preçoFinal2 = p2.preçoComDesconto();
		
		System.out.println(p1.nome + " " + p1.preço + " " + preçoFinal1);
		System.out.println(p2.nome + " " + p2.preço + " " + preçoFinal2);
	}

}
