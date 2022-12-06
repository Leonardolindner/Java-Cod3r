package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		
		Jogador monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		Jogador heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		
		
		System.out.println("O montro tem => " + monstro.vida);
		System.out.println("O heroi tem => " + heroi.vida);
		System.out.println();
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("O montro tem => " + monstro.vida);
		System.out.println("O heroi tem => " + heroi.vida);
	}

}
