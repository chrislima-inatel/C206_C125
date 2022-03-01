package br.inatel.cdg.instrumento;

public abstract class Instrumento {

	protected String marca;
	protected static long numLoteFabricacao;
	
	public abstract void mostraInfo();
	public abstract void emitirSom();
	
}