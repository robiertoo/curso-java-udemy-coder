package modelo.desafioheranca;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "gatos")
public class Gato extends Animal{
	public Gato() {
	}
	
	public Gato(String nome, String som) {
		super(nome, som);
	}
}
