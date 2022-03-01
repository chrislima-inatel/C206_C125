package br.inatel.cdg.instrumento.piano;

import br.inatel.cdg.instrumento.Instrumento;

public class Piano extends Instrumento {
	
	private boolean digital;
	private int numPedais;
	public static int numTeclas;
	
	private Armario armario;
	private EfeitoSonoro[] efeitosSonoros;
	
	public Piano(String marca, boolean digital, int numPedais) {
		this.marca = marca;
		this.digital = digital;
		this.numPedais = numPedais;
		this.efeitosSonoros = new EfeitoSonoro[100];
	}
	
	public void addEfeitoSonoro(EfeitoSonoro efeitoSonoro) {
		for (int i = 0; i < efeitosSonoros.length; i++) {
			if(efeitosSonoros[i]==null) {
				efeitosSonoros[i] = efeitoSonoro;
				break;
			}
		}
	}
	
	@Override
	public void mostraInfo() {
		System.out.println("Instrumento: Piano");
		System.out.println("Marca: " + this.marca);
		System.out.println("Pedais: " + this.numPedais);
		if(armario!=null) {
			System.out.println("Armario: " + this.armario.getTipoMadeira());
		}
		for (EfeitoSonoro efeitoSonoro : efeitosSonoros) {
			if(efeitoSonoro==null)
				break;
			System.out.println("Efeito Sonoro: " + efeitoSonoro.getEfeitoSonoro());
		}
	}

	@Override
	public void emitirSom() {
		System.out.println("Piano Emitindo Som!");
	}
	
	//Getter e Setter
	public void setArmario(Armario armario) {
		this.armario = armario;
	}
}