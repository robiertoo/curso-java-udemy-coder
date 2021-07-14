package fundamentos;

public class Temperatura {	
	static double converterParaCelsius(double ajuste, double fator, int fahrenheit) {
		return (fahrenheit - ajuste) * fator;
	}
	
	public static void main(String[] args) {
		//(°F - 32) * 5/9 = °C
		//32 ajuste 5/9 fator
		
		final double AJUSTE = 32;
		final double FATOR = 5/9.0;
		final int fahrenheit = 0;
		double celsius = converterParaCelsius(AJUSTE, FATOR, fahrenheit);
//		final double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println(fahrenheit + "°F: " + Math.round(celsius) + "°C.");
	}
}
