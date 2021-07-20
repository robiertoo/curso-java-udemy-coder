package streams;

public class Produto {
	private final String nome;
	private final double desconto;
	private final boolean freteGratis;
	
	public Produto(String nome, double desconto, boolean freteGratis) {
		this.nome = nome;
		this.desconto = desconto;
		this.freteGratis = freteGratis;
	}
	
	public String getNome() {
		return nome;
	}
	public double getDesconto() {
		return desconto;
	}
	public boolean isFreteGratis() {
		return freteGratis;
	}
}
