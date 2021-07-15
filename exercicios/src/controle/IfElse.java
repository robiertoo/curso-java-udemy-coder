package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Ifnrome o número");
		
		int numero  = Integer.parseInt(valor);
		
		String mensagem;
		
		if(numero % 2 == 0) mensagem = "Número é par!";
		else mensagem = "Número é impar!";
		
		System.out.println(mensagem);
	}
}
