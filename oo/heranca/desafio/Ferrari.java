package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo{
	
	public Ferrari(){
		super(315);
	}
	
	
	public boolean acelerar() {
		boolean acelerar1 = super.acelerar();
		boolean acelerar2 = super.acelerar();
		boolean acelerar3 = super.acelerar();
		return acelerar1 || acelerar2 || acelerar3 ;
	}

}
