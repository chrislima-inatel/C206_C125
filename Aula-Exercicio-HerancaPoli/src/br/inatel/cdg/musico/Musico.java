package br.inatel.cdg.musico;

import br.inatel.cdg.instrumento.Instrumento;
import br.inatel.cdg.instrumento.corda.Distorcao;

public class Musico {
	
	private String nome;
	private Instrumento[] instrumentos;
	
	public Musico(Instrumento[] instrumentos) {
		this.instrumentos = instrumentos;
	}
	
	public void tocarInstrumento() {
		for (Instrumento instrumento : instrumentos) {
			if(instrumento==null)
				break;
			instrumento.emitirSom();
			//Verifica se eh Distorcao
			if(instrumento instanceof Distorcao) {//é uma?
				Distorcao distorcao = (Distorcao)instrumento;
				distorcao.emitirSomDistorcido();
			}
		}
	}
	
	
	//Getter e Setter
	public void setNome(String nome) {
		this.nome = nome;
	}
}