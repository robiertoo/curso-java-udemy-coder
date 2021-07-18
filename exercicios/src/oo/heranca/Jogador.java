package oo.heranca;

public class Jogador {
	public int vida = 100;
	private int x;
	private int y;
	
	Jogador(int x, int y) {
		this.x = x;
		this.y = y;		
	}
	
	public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		} else return false;
	}
	
	boolean andar(Direcao direcao) {
		if(direcao == Direcao.SUL) y++;
		else if(direcao == Direcao.NORTE) y--;
		else if(direcao == Direcao.LESTE) x++;
		else if(direcao == Direcao.OESTE) x--;
		
		return true;
	}
}
