package br.inatel.cdg.exercicio2.inimigos;

public class CavaleiroPrata extends Inimigo {

	public CavaleiroPrata(String nome, double vida, String tipoArma) {
		super(nome, vida, tipoArma);
	}
	
	@Override
	public void atacando() {
		System.out.println("Cavaleiro de Prata Atacando");
	}

	public void ataqueForte() {
		System.out.println("Ataque Forte!");
	}

}
