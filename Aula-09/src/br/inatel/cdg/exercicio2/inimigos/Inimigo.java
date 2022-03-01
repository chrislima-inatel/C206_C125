package br.inatel.cdg.exercicio2.inimigos;

public class Inimigo {

	protected String nome;
	protected double vida;
	protected String tipoArma;

	public Inimigo(String nome, double vida, String tipoArma) {
		this.nome = nome;
		this.vida = vida;
		this.tipoArma = tipoArma;
	}

	public void atacando() {
		System.out.println("Atacando o jogador");
	}

	public void tomarDano() {
		System.out.println("Tomar dano");
	}

	public String getNome() {
		return nome;
	}

	public double getVida() {
		return vida;
	}

	public String getTipoArma() {
		return tipoArma;
	}
	
	

}