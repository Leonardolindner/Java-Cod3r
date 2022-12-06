package DesafioModulo;

public class Pessoa {

	String nomePessoa;
	double pesoPessoa;
	
	
	Pessoa(String nomeInicial, Double pesoInicial){
		this.nomePessoa = nomeInicial;
		this.pesoPessoa = pesoInicial;
	}
	
	
	double comer(Comida comida) {
		if(comida != null) {
			this.pesoPessoa += comida.pesoComida;
		}
		return(pesoPessoa);
	}
	
	
	String apresentar() {
		return "ola sou o " + nomePessoa + " e tenho " + pesoPessoa + "Kgs.";
	}
	
	
}
