package br.inatel.cdg.inimigos;

import br.inatel.cdg.interfaces.Curavel;

public class CavaleiroPrata extends Inimigo implements Curavel{

	public CavaleiroPrata(String nome, double vida, String tipoArma) {
		super(nome, vida, tipoArma);
	}
	
	public void ataqueForte() {
		System.out.println("Ataque Forte!");
	}
	
	@Override
	public void atacando() {
		System.out.println("Cavaleiro Prata Atacando!");
	}

	@Override
	public void recuperarVida() {
		this.vida += 30;
		
	}

}
