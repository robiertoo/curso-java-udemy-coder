package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c = new Carro();
		c.ligar();
		System.out.println(c.estaLigado());
		
		c.acelerar();
		System.out.println(c.motor.giros());
		
		c.acelerar();
		System.out.println(c.motor.giros());
	}
}
