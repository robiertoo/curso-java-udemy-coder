package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data() {
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String formatarPedaco(int pedaco) {
		final String pedacoFormatado = String.format("%d", pedaco);
		int tamanho = pedacoFormatado.length();
		if(tamanho > 3 || tamanho == 2) return pedacoFormatado;
		else return "0" + pedacoFormatado;
	}
	
	String obterDataFormatada() {
		return String.format("%s/%s/%s", 
				formatarPedaco(dia), formatarPedaco(mes), formatarPedaco(ano));		
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
