package fundamentos.operadores;

public class Atribucao {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b;
		c -= a;
		c *= b;
		c %= a;
		
		System.out.println(c);
		
	}
}	
