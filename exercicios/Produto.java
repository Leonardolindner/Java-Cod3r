package exercicios;

public class Produto {
	
	
	String nome;
	double preço;
	double desconto;
	
	Produto() {
	
	}
	
	
	Produto(String nomeInicial, double preçoInicial, double descontoInicial){
		nome = nomeInicial;
		preço = preçoInicial;
		desconto = descontoInicial;
	}
	
	
	double preçoComDesconto() {
		return (preço * (1 - desconto));
	}

	
	
	
}
