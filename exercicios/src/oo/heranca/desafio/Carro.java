package oo.heranca.desafio;

/*
 * velocidade atual
 * acelerar v =+ 5
 * frear  !< 0 v-= 5
 * 
 */

public class Carro {
	private int velocidadeAtual = 0;
	private final int VELOCIDADE_MAXIMA;
	private int delta = 5;
	
	protected Carro (int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
			
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}


	public boolean acelerar() {
		if(this.velocidadeAtual + getDelta() > this.VELOCIDADE_MAXIMA) {
			this.velocidadeAtual = this.VELOCIDADE_MAXIMA;
			return false;
		}
		this.velocidadeAtual += getDelta();
		return true;
	}
	
	public boolean frear() {
		boolean menorQueZero = this.velocidadeAtual - getDelta() < 0;
		if(!menorQueZero) {
			this.velocidadeAtual -= getDelta();
			return true;
		}
		this.velocidadeAtual = 0;
		return false;
	}
	
	public void obterVelocidadeAtual() {
		System.out.println("Velocidade atual: " + this.velocidadeAtual);
	}
}
