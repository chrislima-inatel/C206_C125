package br.inatel.cdg.exercicio15.heroi;

public abstract class Heroi {
	
	protected String nome;
	protected double vida;
	
	public abstract void andar();
	
	public void mostraInfo() {
		System.out.println("Informações do Heroi");
		System.out.println("Nome: " + this.nome);
		System.out.println("Vida: " + this.vida);
	}

}
