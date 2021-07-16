package classe.desafio;

/*
 * String Nome
 * double Peso
 * 
 *  void comer(Comida comida) add this.peso
 */

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		this.peso += comida.peso;
		System.out.printf("%s ganhou %.2f Kg após comer %s.\n", 
				this.nome, comida.peso, comida.nome);
	}
	
	void apresentar() {
		System.out.printf("%s inicialmente possui %.2f Kg. \n", 
				this.nome, this.peso);
	}
	
	void finalizar() {
		System.out.printf("Depois de comer tudo, %s está com %.2f Kg. \n", 
				this.nome, this.peso);
	}
}
