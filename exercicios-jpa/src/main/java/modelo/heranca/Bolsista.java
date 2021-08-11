package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("AB")
public class Bolsista extends Aluno{
	private double valorBolsa;
	
	public Bolsista() {
		// TODO Auto-generated constructor stub
	}

	public Bolsista(double valorBolsa, long matricula, String nome) {
		super(matricula, nome);
		this.valorBolsa = valorBolsa;
	}

	public double getValorBolsa() {
		return valorBolsa;
	}

	public void setValorBolsa(double valorBolsa) {
		this.valorBolsa = valorBolsa;
	}
	
}
