package controle;

public class DesafioFor {
	public static void main(String[] args) {
//		String valor = "#";
//		for(int i = 1; i <= 5 ; i++) {
//			System.out.println(valor);
//			valor += "#";
//		}
		
		/*
		 * desafio: 
		 * fazer a mesma coisa que a parte de cima,
		 * sem utilizar numeros para controlar o la�o
		 */
		
		
		for(String valor = "#"; !valor.equals("######"); valor += "#") {
			System.out.println(valor);
		}
	}
}
