package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		/*
		 * offer e add semelhantes
		 * o que difere ? o comportamento quando fila est? cheia
		 * 
		 * add retorna false
		 * enquanto offer lan?a exce??o
		 */
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		/*
		 * mesmo vale para peek e element para quando fila est? vazia
		 * peek retorna false
		 * enquanto element lan?a uam exce??o
		 */
		
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println(fila.size());
//		System.out.println(fila.clear());
		System.out.println(fila.isEmpty());
		
		
		/*
		 * mesmo que os anteriores
		 * poll ao remover vazio retorna false
		 * enquanto remove lanca excecao
		 */
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
	}
}
