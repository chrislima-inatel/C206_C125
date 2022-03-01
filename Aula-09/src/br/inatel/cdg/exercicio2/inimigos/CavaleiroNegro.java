package br.inatel.cdg.exercicio2.inimigos;

public class CavaleiroNegro extends Inimigo {
	
	public CavaleiroNegro(String nome, double vida, String tipoArma) {
		super(nome,vida,tipoArma);
	}
	
	@Override
	public void atacando() {
		System.out.println("Cavaleiro Negro Atacando Normal");
	}

	public void ataqueRapido() {
		System.out.println("Atacando rapido");
	}
	

}
