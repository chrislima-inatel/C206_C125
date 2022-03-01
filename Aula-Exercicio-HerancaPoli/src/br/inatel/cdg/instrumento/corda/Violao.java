package br.inatel.cdg.instrumento.corda;

import br.inatel.cdg.instrumento.Instrumento;

public class Violao extends Instrumento implements Distorcao {
	
	private int numCordas;
		
	public Violao(String marca, int numCordas) {
		this.marca = marca;
		this.numCordas = numCordas;
	}

	@Override
	public void emitirSomDistorcido() {
		System.out.println("Violao Emitindo Som Distorcido");
	}

	@Override
	public void mostraInfo() {
		System.out.println("Instrumento: Violao");
		System.out.println("Marca: " + this.marca);
		System.out.println("Lote Fabricao: " + 
						Instrumento.numLoteFabricacao);
		System.out.println("Numero Cordas: " + this.numCordas);
	}

	@Override
	public void emitirSom() {
		System.out.println("Violao Emitindo Som Normal");
	}
	
	//Getter
	public int getNumCordas() {
		return numCordas;
	}

}