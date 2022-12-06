package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("quantos alunos? ");
		int quantidadeAlunos = entrada.nextInt();
		
		System.out.println("quantas notas por aluno?");
		int quantidadeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];
		
		double total = 0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
			
				System.out.printf("informe a nota %d do aluno %d: ", i, j);
				notasDaTurma[i][j] = entrada.nextDouble();
				total += notasDaTurma[i][j];
			}
			
		}
		
		double media = total / (quantidadeAlunos * quantidadeNotas);
		System.out.println("media de turma é " + media);
		
		for (double[] notasAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasAluno));
		}
		
		entrada.close();
	}
}
