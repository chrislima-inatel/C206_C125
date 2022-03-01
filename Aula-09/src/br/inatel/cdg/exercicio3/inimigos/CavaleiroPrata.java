package br.inatel.cdg.exercicio3.inimigos;

public class CavaleiroPrata extends Inimigo {

	public CavaleiroPrata(String nome, double vida, String tipoArma) {
		super(nome, vida, tipoArma);
	}
	
	public void ataqueForte() {
		System.out.println("Ataque Forte!");
	}

}
