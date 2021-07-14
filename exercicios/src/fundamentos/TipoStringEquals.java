package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		String s = new String("2");
		System.out.println(s.equalsIgnoreCase("2"));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2".equals(s2));
		
		
		entrada.close();
	}
}
