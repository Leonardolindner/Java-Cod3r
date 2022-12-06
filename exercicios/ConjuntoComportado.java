package exercicios;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	
	public static void main(String[] args) {
		Set<String> listaAprovados = new HashSet<>();//lista fora de ordem
		listaAprovados.add("luiza");
		listaAprovados.add("leonardo");
		listaAprovados.add("tamires");
		listaAprovados.add("cecilia");
		listaAprovados.add("maria");
		
		for(String candidato:listaAprovados) {
			System.out.println(candidato);
		}
		
		SortedSet<String> lista2Aprovados = new TreeSet<String>();//lista em ordem
		lista2Aprovados.add("luiza");
		lista2Aprovados.add("leonardo");
		lista2Aprovados.add("tamires");
		lista2Aprovados.add("cecilia");
		lista2Aprovados.add("maria");
		
		for(String candidato:lista2Aprovados) {
			System.out.println(candidato);
	}
}
	
}
