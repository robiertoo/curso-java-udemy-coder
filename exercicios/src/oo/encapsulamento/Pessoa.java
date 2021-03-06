package oo.encapsulamento;

public class Pessoa {
	private String nome;
	private int idade;
	private String sobrenome;
	
	protected Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}	
	
	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if(idade >= 0 && idade <= 130) this.idade = idade;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() {
		return this.getNome() + " " + this.getSobrenome();
	}

	@Override
	public String toString() {
		return "Eu sou " + this.getNomeCompleto() + " e tenho " + this.getIdade() + " anos.";
	}
}
