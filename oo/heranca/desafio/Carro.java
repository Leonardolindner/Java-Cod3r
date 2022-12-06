package oo.heranca.desafio;

public class Carro  {
	
	private final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual = 100;
	int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public boolean acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}
		velocidadeAtual += 5;
	
		return true;
	}
	public boolean frear() {
		if(velocidadeAtual > 0) {
		velocidadeAtual -= 5;
		return true;
		}else {
			return false;
			
			
		}
	}

}
