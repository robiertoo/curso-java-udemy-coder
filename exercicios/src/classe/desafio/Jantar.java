package classe.desafio;

/*
 * feijao
 * arroz
 * 
 * pessoa come comida
 * 
 * mostrar peso antes / depois comer
 */

public class Jantar {
	public static void main(String[] args) {
		Comida arroz = new Comida("Arroz", 0.250);
		Comida feijao = new Comida("Feijão", 0.350);
		Comida bife = new Comida("Bife", 0.400);
		
		Pessoa roberto = new Pessoa("Roberto", 58.500);
		
		roberto.apresentar();
		
		roberto.comer(arroz);
		roberto.comer(feijao);
		roberto.comer(bife);
		
		roberto.finalizar();
	}
}
