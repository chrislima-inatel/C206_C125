package br.inatel.cdg.exercicio15.heroi;

public class Superman extends Heroi implements Golpear{

	public Superman(String nome, double vida) {
		this.nome = nome;
		this.vida = vida;
	}
	
	@Override
	public void atacar() {
		System.out.println("Superman atacando");
	}

	@Override
	public void andar() {
		System.out.println("Superman andando");
	}

}
