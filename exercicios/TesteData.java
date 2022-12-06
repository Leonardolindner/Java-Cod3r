package exercicios;

public class TesteData {
	
	public static void main(String[] args) {
		
		
		Data d1 = new Data();
		
		Data d2 = new Data(8, 10, 1989);
	
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}

}
