package modelo.desafioheranca;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cachorros")
public class Cachorro extends Animal{
	public Cachorro() {
	
	}
	
	public Cachorro(String nome, String som) {
		super(nome, som);
	}
}
