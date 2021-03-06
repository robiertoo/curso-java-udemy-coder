package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
 * 1. N?mero para string binaria 6 => "110";
 * 2. Reverter a string "110" => "011"
 * 3. Converter de volta para inteiro "011" => 3
 */

public class DesafioMap {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Consumer<Object> println = System.out::println;
		
		Function<Integer, String> numeroParaStringBinaria = inteiro -> Integer.toBinaryString(inteiro);
		UnaryOperator<String> reverterString = string -> new StringBuilder(string).reverse().toString();
		Function<String, Integer> stringBinariaParaNumero = string -> Integer.parseInt(string, 2);
		
		nums.stream()
		.map(numeroParaStringBinaria)
		.map(reverterString)
		.map(stringBinariaParaNumero)
		.forEach(println);
	}
}