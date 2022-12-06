package Coleçoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//offer e add -> adicionam elementos na fila
		//diferença é o comportamento ocorre quando a fila está cheia
		fila.offer("ana");
		fila.add("maria");
		fila.offer("cecilia");
		fila.add("luiza");
		fila.offer("tamires");
		fila.add("leonardo");
		
		//peek e o element obtem o proximo elemento da fila sem remover
		//diferença é o comportamento que ocorre quando a fila está vazia
		System.out.println(fila.peek());
		System.out.println(fila.peek());//retorna null caso a fila estiver vazia
		System.out.println(fila.element());
		System.out.println(fila.element());// lança uma exceção
		
		/*
		 * fila.size(); para o tamanho
		 * fila.clear(); para limpar
		 * fila.isEmpty(); para saber se a fila está ou não vazia
		 * fila.pool(); retorna o primeiro elemento dafila ja o removendo 
		 */
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());// lança uma exceção 
		
	}
}
