package br.inatel.cdg.inimigos;

public class CavaleiroNegro extends Inimigo {
	
	public CavaleiroNegro(String nome, double vida, String tipoArma) {
		super(nome,vida,tipoArma);
	}
	
	public void ataqueRapido() {
		System.out.println("Atacando rapido");
	}
	
	@Override
	public void atacando() {
		System.out.println("Cavaleiro Negro Atacando!");
	}
	
	@Override
	public void tomarDano() {
		this.vida -=5;
		System.out.println("Eu sou o Cavaleiro Negro! Sou forte!");
	}

}
