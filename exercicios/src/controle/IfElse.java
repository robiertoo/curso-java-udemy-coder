package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Ifnrome o n�mero");
		
		int numero  = Integer.parseInt(valor);
		
		String mensagem;
		
		if(numero % 2 == 0) mensagem = "N�mero � par!";
		else mensagem = "N�mero � impar!";
		
		System.out.println(mensagem);
	}
}
