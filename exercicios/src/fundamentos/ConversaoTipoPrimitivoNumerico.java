package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1.324654123;
		System.out.println(a);
		
		float b = (float) 1.324654123; //cast
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
	}
}
