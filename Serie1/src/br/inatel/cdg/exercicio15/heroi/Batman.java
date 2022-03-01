package br.inatel.cdg.exercicio15.heroi;

public class Batman extends Heroi implements Golpear {

	public Batman(String nome, double vida) {
		this.nome = nome;
		this.vida = vida;
	}
	
	@Override
	public void atacar() {
		System.out.println("Batman atacando");

	}

	@Override
	public void andar() {
		System.out.println("Batman andando");

	}

}
