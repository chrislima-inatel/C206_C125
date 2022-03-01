package br.inatel.cdg.jogador;

import br.inatel.cdg.interfaces.Curavel;

public class Sacerdote extends Jogador implements Curavel {

	public Sacerdote(String nome, double vida, String tipoArma) {
		super(nome, vida, tipoArma);
	}

	@Override
	public void recuperarVida() {
		this.vida += 40;
	}
}