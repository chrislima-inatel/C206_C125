package br.inatel.cdg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import br.inatel.cdg.pilha.exception.PilhaVaziaException;
import org.junit.Before;
import org.junit.Test;

import br.inatel.cdg.pilha.Pilha;

public class TestePilha {
	
	private Pilha<Integer> pilha;
	
	@Before //Fixture
	public void init() {
		pilha = new Pilha<>();
	}
	
	@Test
	public void testePilhaEstaVazia() {
		boolean resultado = pilha.pilhaVazia();
		assertTrue(resultado);
	}
	
	@Test
	public void testePilhaPush2Elementos() {
		pilha.push(13);
		pilha.push(23);
		assertFalse(pilha.pilhaVazia());
		assertEquals(2, pilha.getQtdElementos());
		
		int topo = pilha.mostraTopo();
		assertEquals(23,topo);
		
	}

	@Test
	public void testePilhaPop(){
		pilha.push(13);
		pilha.push(23);
		pilha.push(33);
		int topo = pilha.mostraTopo();
		assertEquals(3,pilha.getQtdElementos());
		assertEquals(33,topo);

		topo = pilha.pop();
		assertEquals(33,topo);
		assertEquals(2,pilha.getQtdElementos());

	}

	@Test(expected = PilhaVaziaException.class)
	public void popPilhaVazia(){
		pilha.pop();
	}
	
}