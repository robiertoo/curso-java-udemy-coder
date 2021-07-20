package streams;

public class Funcionario {
	private final String nome;
	private final int anosDeEmpresa;
	private final boolean satisfeito;
	
	public Funcionario(String nome, int anosDeEmpresa, boolean satisfeito) {
		this.nome = nome;
		this.anosDeEmpresa = anosDeEmpresa;
		this.satisfeito = satisfeito;
	}
	public String getNome() {
		return nome;
	}
	public int getAnosDeEmpresa() {
		return anosDeEmpresa;
	}
	public boolean isSatisfeito() {
		return satisfeito;
	}	
}
