package fundamentos.operadores;

public class DesafioLogicos {
	/*
	 * trabalho na ter?a
	 * trabalho da quinta
	 * 
	 * if 1 tv 32
	 * else if2 tv 50
	 * sorvete
	 * 
	 */
	
	public static void main(String[] args) {
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		String mensagem1;
		String mensagem2; 
		
		if(trabalho1 || trabalho2) {
			mensagem1 = "Bora tomar sorvete, fam?lia";
		} else {
			mensagem1 = "Bora ficar saud?vel, fam?lia";
		}
		
		if((trabalho1 && !trabalho2) || (!trabalho1 && trabalho2)) {
			mensagem2 = "Bora comprar a tv de 32 polegadas";
		} else if(trabalho1 && trabalho2) {
			mensagem2 = "Bora comprar a tv de 50 polegadas!";
		} else {
			mensagem2 = "Bora comprar nada n?o";
		}
		
		System.out.println(mensagem1);
		System.out.println(mensagem2);
	}
}
