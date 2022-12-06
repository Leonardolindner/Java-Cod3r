package Coleçoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<UsuarioLista> lista = new ArrayList<>();
		
		UsuarioLista u1 = new UsuarioLista("ana");
		lista.add(u1);
		
		lista.add(new UsuarioLista("joão"));
		lista.add(new UsuarioLista("maria"));
		lista.add(new UsuarioLista("cecilia"));
		lista.add(new UsuarioLista("luiza"));
		
		System.out.println(lista.get(3).toString());
		System.out.println();
		
		for(UsuarioLista u  : lista) {
			System.out.println(u.nome);
		}
		System.out.println(lista.get(2));
	}
}
