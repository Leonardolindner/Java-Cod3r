package exercicios;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		//hashSet nao aceita tipo primitivo somente objeto
		conjunto.add(true);// bollean -> Bollean
		conjunto.add(1.2); // double -> Double
		conjunto.add(1); // int -> Integer
		conjunto.add("teste");// toda string ja é um objeto
		conjunto.add('x'); //char -> Charactere
		
		System.out.println(conjunto.remove("teste")); //remove lemento e imprime true
		System.out.println(conjunto.remove('x')); // caso noo tenha removida imprime false
		
		System.out.println("tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains(true));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains('x'));

		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		//conjunto.addAll(nums); // união entre dois conjuntos
		//conjunto.addAll(nums);
		conjunto.retainAll(nums);//interseção entre conjuntos
		
		System.out.println(conjunto);
		conjunto.clear();
		System.out.println(conjunto);//apaga os elementos
	}

}
