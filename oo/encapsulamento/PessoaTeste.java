package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Leonardo", "Lindner", -30);
		
		System.out.println(p1.nomeCompleto());
		p1.setIdade(230);
		System.out.println(p1.getIdade());
		System.out.println(p1.toString());
		
	}
}
