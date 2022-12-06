package Coleçoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto"); //put adicionou
		usuarios.put(1, "Ricardo"); //put alterou
		usuarios.put(2, "Rafaela");
		usuarios.put(3, "Rebeca");
		usuarios.put(4, "Roberta");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());//está vazio? retorna false
		System.out.println(usuarios.keySet());// conjunto da chave
		System.out.println(usuarios.values());//conjunto dos valores
		System.out.println(usuarios.entrySet());//conjunto chave e valor
		
		System.out.println(usuarios.containsKey(3));//contem? cheve....?
		System.out.println(usuarios.containsValue("Roberta"));//contém? valor...? caseSensitive
		
		System.out.println(usuarios.get(3));//pega apartir da chave
		
		//percorrendo o array atraves da chave
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		// percorrendo o array atraves do valor
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		// percorrorrendo atraves da chave e valor
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro);
		}
		
		
	}

}
