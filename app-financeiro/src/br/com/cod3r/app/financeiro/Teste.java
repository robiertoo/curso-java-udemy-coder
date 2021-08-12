package br.com.cod3r.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;

public class Teste {
	public static void main(String[] args) {
		Calculadora calc = ServiceLoader
				.load(Calculadora.class)
				.findFirst()
				.get();
		System.out.println(calc.soma(2, 3, 4));
		
//		OperacoesAritmeticas op = new OperacoesAritmeticas();
//		System.out.println(op.soma(4, 5, 6));
		
//		System.out.println(CalculadoraImpl.class.getName());
//		System.out.println(CalculadoraImpl.class.getDeclaredFields()[0]);
		
		try {
			Field fieldId = calc.getClass().getDeclaredFields()[0];
			fieldId.setAccessible(true);
			fieldId.set(calc, "def");
			fieldId.setAccessible(false);
			System.out.println(calc.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Calc c1 = new CalcImpl1();
//		Calc c2 = new CalcImpl2();
//		
//		System.out.println(c1.soma(1, 2, 3));
//		System.out.println(c2.soma(1, 2, 3));
		
	}
}
