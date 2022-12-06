package oo.heranca.desafio.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro ferrari = new Ferrari();
		Carro civic = new Civic();
		
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
		System.out.println();
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.frear();
		
		civic.acelerar();		
		civic.acelerar();		
		civic.acelerar();		
		civic.acelerar();		
		civic.frear();
		
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
	}
}
