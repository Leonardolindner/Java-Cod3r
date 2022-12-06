package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String sobrenome;
	
	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	
	//GETTER
	public int getIdade() {
		return idade;
	}
	
	//SETTER
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade > 0 && novaIdade < 120) {
		this.idade = novaIdade;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String nomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	@Override
	public String toString() {
		return "Ola eu sou o " + getNome() + " e tenho " + getIdade() + " anos.";
	}

}
