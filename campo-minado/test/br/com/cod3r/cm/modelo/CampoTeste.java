package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.excecao.ExplosaoException;

public class CampoTeste {
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeVizinhoDistancia1Esquerda() {
		Campo vizinho = new Campo(3, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);		
	}

	@Test
	void testeVizinhoDistancia1Direita() {
		Campo vizinho = new Campo(3, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);		
	}

	@Test
	void testeVizinhoDistancia1Cima() {
		Campo vizinho = new Campo(2, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);		
	}
	
	@Test
	void testeVizinhoDistancia1Baixo() {
		Campo vizinho = new Campo(4, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);		
	}

	@Test
	void testeVizinhoDistancia2() {
		Campo vizinho = new Campo(2, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);		
	}

	@Test
	void testeNaoVizinhoDistancia() {
		Campo vizinho = new Campo(1, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);		
	}
	
	@Test
	void testeValorPadraoAtributoMarcacao() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}

	@Test
	void testeAlternarMarcacaoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}

	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();
		});
	}
	
	@Test
	void testeAbrirComVizinhos1() {
		Campo vizinho = new Campo(3,4);
		Campo vizinhoDoVizinho = new Campo(4,5);
		campo.adicionarVizinho(vizinho);
		vizinho.adicionarVizinho(vizinhoDoVizinho);
		assertTrue(campo.abrir());
		assertTrue(campo.isAberto());
		assertTrue(vizinho.isAberto());
		assertTrue(vizinhoDoVizinho.isAberto());
	}
	
	@Test
	void testeAbrirComVizinhos2() {
		Campo vizinho = new Campo(3,4);
		Campo vizinhoDoVizinho = new Campo(2,3);
		campo.adicionarVizinho(vizinho);
		vizinho.adicionarVizinho(vizinhoDoVizinho);
		vizinhoDoVizinho.minar();
		
		assertTrue(campo.abrir());
		assertTrue(campo.isAberto());
		assertTrue(vizinho.isAberto());
		assertFalse(vizinhoDoVizinho.isAberto());
	}
	
	@Test
	void testeContarVizinhosBombados() {
		Campo vizinho1 = new Campo(3, 4);
		Campo vizinho2 = new Campo(4, 3);
		campo.adicionarVizinho(vizinho1);
		campo.adicionarVizinho(vizinho2);
		vizinho1.minar();
		vizinho2.minar();
		assertEquals(2, campo.contarVizinhosBombados());
	}
	
	@Test
	void testeIsFechado() {
		campo.abrir();
		assertFalse(campo.isFechado());
		assertTrue(campo.isAberto());
	}
	
	@Test
	void testeGetLinha() {
		assertEquals(3, campo.getLinha());
	}

	@Test
	void testeGetColuna() {
		assertEquals(3, campo.getColuna());
	}
	
	@Test
	void testeObjetivoAlcancadoDesvendado() {
		campo.abrir();
		assertTrue(campo.objetivoAlcancado());
	}
	
	@Test
	void testeObjetivoAlcancadoProtegido() {
		campo.alternarMarcacao();
		campo.minar();
		assertTrue(campo.objetivoAlcancado());
	}
	
	@Test
	void testeReiniciar() {
		campo.reiniciar();
		assertFalse(campo.isAberto());
		assertFalse(campo.isMarcado());
		assertFalse(campo.isMinado());
	}
	
	@Test
	void testeToStringMinado() {
		campo.alternarMarcacao();
		assertEquals("x", campo.toString());
	}

	@Test
	void testeToStringAbertoEMinado() {
		campo.abrir();
		campo.minar();
		assertEquals("*", campo.toString());
	}
	
	@Test
	void testeToStringAbertoEVizinhosBombados() {
		Campo vizinho = new Campo(3,2);
		vizinho.minar();
		
		campo.adicionarVizinho(vizinho);
		campo.abrir();
		assertEquals(Long.toString(1), campo.toString());
	}
	
	@Test
	void testeToStringAberto() {
		campo.abrir();
		assertEquals(" ", campo.toString());
	}

	@Test
	void testeToStringElse() {
		assertEquals("?", campo.toString());
	}
}
