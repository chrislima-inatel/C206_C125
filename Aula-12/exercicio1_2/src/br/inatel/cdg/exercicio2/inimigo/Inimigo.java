package br.inatel.cdg.exercicio2.inimigo;

public abstract class Inimigo implements Comparable<Inimigo>{
	
	protected String nome;
	protected int vida;
	
	public Inimigo(String nome, int vida) {
		this.nome = nome;
		this.vida = vida;
	}

	public String getNome() {
		return nome;
	}

	public int getVida() {
		return vida;
	}
	
	@Override
	public int compareTo(Inimigo o) {
		if(this.getVida() < o.getVida()) {
			return 1;
		} 
		if(this.getVida() > o.getVida()) {
			return -1;
		}
		return 0;
	}

}
