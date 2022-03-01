package br.inatel.cdg.instrumento.corda;

import br.inatel.cdg.instrumento.Instrumento;

public class Guitarra extends Instrumento implements Distorcao {

	private int numCordas;
	
	public Guitarra(String marca, int numCordas) {
		this.marca = marca;
		this.numCordas = numCordas;
	}
	
	@Override
	public void emitirSomDistorcido() {
		System.out.println("Guitarra Emitindo Som Distorcido");

	}

	@Override
	public void mostraInfo() {
		System.out.println("Instrumento: Guitarra");
		System.out.println("Marca: " + this.marca);
		System.out.println("Lote Fabricao: " + 
						Instrumento.numLoteFabricacao);
		System.out.println("Numero Cordas: " + this.numCordas);

	}

	@Override
	public void emitirSom() {
		System.out.println("Guitarra Emitindo Som Normal");
	}
	
	public int getNumCordas() {
		return numCordas;
	}
	
}