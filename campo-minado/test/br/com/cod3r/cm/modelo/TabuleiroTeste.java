package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TabuleiroTeste {
	private Tabuleiro tabuleiro;
	
	@BeforeEach
	void iniciar() {
		tabuleiro = new Tabuleiro(6, 6, 6);
	}
	
	@Test
	void testeAbrir() {
		assertEquals(1, 1);
	}
}
