package br.inatel.cdg.exercicio2.inimigos;

public class ZumbiLerdo extends Inimigo{
	
	public ZumbiLerdo(String nome, double vida, String tipoArma) {
		super(nome,vida,tipoArma);
	}

	@Override
	public void atacando() {
		System.out.println("Zumbi Lerdo Atacando!");
	}
}