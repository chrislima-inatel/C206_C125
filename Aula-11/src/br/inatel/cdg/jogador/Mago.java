package br.inatel.cdg.jogador;

import br.inatel.cdg.interfaces.Curavel;

public class Mago extends Jogador implements Curavel {

	public Mago(String nome, double vida, String tipoArma) {
		super(nome, vida, tipoArma);
	}

	@Override
	public void recuperarVida() {
		this.vida += 5;
	}
	
		
}
