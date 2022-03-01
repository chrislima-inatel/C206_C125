package br.inatel.cdg;

import br.inatel.cdg.instrumento.Instrumento;
import br.inatel.cdg.instrumento.corda.Guitarra;
import br.inatel.cdg.instrumento.corda.Violao;
import br.inatel.cdg.instrumento.piano.Armario;
import br.inatel.cdg.instrumento.piano.EfeitoSonoro;
import br.inatel.cdg.instrumento.piano.Piano;
import br.inatel.cdg.musico.Musico;

public class App {

	public static void main(String[] args) {
		
		Piano piano = new Piano("Yamaha", false, 3); 
		
		Instrumento[] instrumentos = new Instrumento[3];
		instrumentos[0] = new Violao("Giannini", 6);
		instrumentos[1] = new Guitarra("Gibson", 7);
		instrumentos[2] = piano;
		
		Musico musico = new Musico(instrumentos);
		musico.setNome("Seu Madruga");
		//musico.tocarInstrumento();
		
		//piano.setArmario(new Armario("Madeira da boa!"));
		
		piano.addEfeitoSonoro(new EfeitoSonoro("Efeito Legal"));
		piano.addEfeitoSonoro(new EfeitoSonoro("Efeito Zenner"));
		piano.addEfeitoSonoro(new EfeitoSonoro("Efeito 1n4007"));
		
		piano.mostraInfo();
		
		//musico.tocarDistorcao(violao);//Instrumento, Distorcao
	}

}
