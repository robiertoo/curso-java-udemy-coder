package br.com.robiertoo.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {	
	@GetMapping("/somar/{numero1}/{numero2}")
	public int somar(@PathVariable int numero1, @PathVariable int numero2) {
		return numero1 + numero2;
	}
	
	@GetMapping("/subtrair")
	public int subtrair(
		@RequestParam(name = "numero1") int numero1,
		@RequestParam(name = "numero2") int numero2
	) {
		return numero1 - numero2;
	}
}
