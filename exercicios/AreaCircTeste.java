package exercicios;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(10);
		
		AreaCirc a2 = new AreaCirc(5);
		a2.raio = 100;
		   
		
		
		System.out.println(AreaCirc.area(10));
		System.out.println(AreaCirc.PI);
		System.out.println(a1);
	}

}
