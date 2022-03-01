package br.inatel.cdg.inimigos;

public abstract class Inimigo {

	protected String nome;
	protected double vida;
	protected String tipoArma;

	public Inimigo(String nome, double vida, String tipoArma) {
		this.nome = nome;
		this.vida = vida;
		this.tipoArma = tipoArma;
	}

	public abstract void atacando();

	public void tomarDano() {
		this.vida -= 10;
	}

	//Getters
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