package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	public boolean isLigarTurbo() {
		return ligarTurbo;
	}

	public void setLigarTurbo(boolean ligarTurbo) {
		this.ligarTurbo = ligarTurbo;
	}

	public boolean isLigarAr() {
		return ligarAr;
	}

	public void setLigarAr(boolean ligarAr) {
		this.ligarAr = ligarAr;
	}

	@Override
	public void ligarTurbo() {
		setLigarTurbo(true);
	}
	
	@Override
	public void desligarTurbo() {
		setLigarTurbo(false);
	}
	
	@Override
	public void ligarAr() {
		setLigarAr(true);
	}
	
	@Override
	public void desligarAr() {
		setLigarAr(false);		
	}
	
	@Override
	public int getDelta() {
		if(isLigarTurbo() && !isLigarAr()) return 35;
		if(isLigarTurbo() && isLigarAr()) return 30;			
		if(!isLigarTurbo() && !isLigarAr()) return 20;
		return 15;
	}
}
