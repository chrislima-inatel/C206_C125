package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigos.Inimigo;

public abstract class Jogador {

	protected String nome;
	protected double vida;
	protected String tipoArma;
	
	public Jogador(String nome, double vida, String tipoArma) {
		this.nome = nome;
		this.vida = vida;
		this.tipoArma = tipoArma;
	}

	public void atacar(Inimigo inimigo) {
		inimigo.tomarDano();
		System.out.println("O inimigo " + inimigo.getNome() + " tomou dano!");
	}
	
	public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
        System.out.println("String: " + this.tipoArma);
    }
	
	//Getter
	public String getNome() {
		return nome;
	}

	public double getVida() {
		return vida;
	}
		
}