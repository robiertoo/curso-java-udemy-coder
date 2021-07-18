package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Teste {
	public static void main(String[] args) {
		Civic civic = new Civic(200);
		Ferrari ferrari = new Ferrari(350);
		
		civic.obterVelocidadeAtual();
		ferrari.obterVelocidadeAtual();
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		ferrari.acelerar();
		ferrari.ligarTurbo();
		ferrari.acelerar();
		System.out.println(ferrari.velocidadeDoAr());
		ferrari.ligarAr();
		ferrari.acelerar();
		ferrari.desligarTurbo();
		
		civic.obterVelocidadeAtual();
		ferrari.obterVelocidadeAtual();
		
		civic.frear();
		civic.frear();
		ferrari.frear();
		ferrari.frear();
		
		civic.obterVelocidadeAtual();
		ferrari.obterVelocidadeAtual();
	}
}
