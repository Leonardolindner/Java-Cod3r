package arrays;

import java.util.Scanner;

public class DesafioFor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("informe quantas notas você vai iterar: ");
		
		//entrada de dados
		int quantidadeNotas = scan.nextInt();
		double[] notasAluno = new double[quantidadeNotas];
		double totalNotas = 0;

		for(int i = 0; i < notasAluno.length; i++) {
			System.out.println("digite a nota do aluno: ");
			notasAluno[i] = scan.nextDouble();
		}
		
		//calculo da media
		for(double nota: notasAluno) {
			totalNotas += nota;
		}
		
		double media = totalNotas / notasAluno.length;
		
		System.out.printf(" a media do aluno foi: %.2f",media );
		
				
		scan.close();
	}

}
