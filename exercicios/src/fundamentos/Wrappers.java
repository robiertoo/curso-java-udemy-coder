package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
//		Scanner entrada = new Scanner(System.in);
		
		Byte b = 100;
		Short s = 1000;
//		Integer i = Integer.parseInt(entrada.next());
		Integer i = 10000;
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		
//		entrada.close();
		
		Boolean bl = false;
		
		System.out.println(bl.booleanValue());
		
		Character c = '#';
		System.out.println(c);
		
		Float f = 3.14F;
		System.out.println(f.floatValue() * 5);
	}
}
