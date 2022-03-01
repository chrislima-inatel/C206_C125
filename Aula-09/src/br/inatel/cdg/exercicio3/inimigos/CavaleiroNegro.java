package br.inatel.cdg.exercicio3.inimigos;

public class CavaleiroNegro extends Inimigo {
	
	public CavaleiroNegro(String nome, double vida, String tipoArma) {
		super(nome,vida,tipoArma);
	}
	
	public void ataqueRapido() {
		System.out.println("Atacando rapido");
	}
	

}
