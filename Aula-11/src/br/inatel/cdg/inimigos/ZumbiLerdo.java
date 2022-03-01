package br.inatel.cdg.inimigos;

public class ZumbiLerdo extends Inimigo{
	
	public ZumbiLerdo(String nome, double vida, String tipoArma) {
		super(nome,vida,tipoArma);
	}
	
	@Override
	public void atacando() {
		System.out.println("Zumbi Lerdo Atacando!");		
	}
	
	@Override
	public void tomarDano() {
		this.vida -= 30;
	}
}