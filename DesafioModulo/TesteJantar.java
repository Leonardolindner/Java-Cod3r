package DesafioModulo;

public class TesteJantar {
	public static void main(String[] args) {
		
		Comida c1 = new Comida("feijao", 0.236);
		
		Pessoa p1 = new Pessoa("tamires", 72.350);
		
		
		
		System.out.println(p1.apresentar());		
		p1.comer(c1);
		System.out.println(p1.apresentar());
		
		

	}

}
