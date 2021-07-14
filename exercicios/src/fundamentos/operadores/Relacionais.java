package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		System.out.println(3 > 4);
		System.out.println(3 < 4);
		System.out.println(3 <= 4);
		System.out.println(3 >= 4);
		System.out.println(3 != 4);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
				
	}
}
