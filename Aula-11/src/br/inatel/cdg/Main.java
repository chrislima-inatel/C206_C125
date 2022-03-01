package br.inatel.cdg;

import br.inatel.cdg.inimigos.CavaleiroPrata;
import br.inatel.cdg.inimigos.Inimigo;
import br.inatel.cdg.interfaces.Curavel;
import br.inatel.cdg.jogador.Jogador;
import br.inatel.cdg.jogador.Mago;
import br.inatel.cdg.jogador.Sacerdote;

public class Main {

	public static void main(String[] args) {
		
		Mago mago = new Mago("Mago Implacavel", 50, "Cajado");
		Sacerdote sacerdote = 
				new Sacerdote("Padre do Balao", 60, "Cajado Curto");
		CavaleiroPrata cavPrata = 
				new CavaleiroPrata("Cavaleiro Prata", 200, "Ultra Espada");
		
		
		//Imprimir informacoes do jogador e cavaleiro prata
		mago.mostraInfo();
		sacerdote.mostraInfo();
		System.out.println("Vida do Cavaleiro Prata " + cavPrata.getVida());
		
		
		//Curando a vida dos jogadores e inimigos
		mago.recuperarVida();
		sacerdote.recuperarVida();
		cavPrata.recuperarVida();
		
		System.out.println("Mostrando a nova vida!");
		mago.mostraInfo();
		sacerdote.mostraInfo();
		System.out.println("Vida do Cavaleiro Prata " + cavPrata.getVida());
		
		//Referenciando mago e sacerdote como Curavel
		Curavel magoCuravel = mago;
		Curavel sacerdoteCuravel = sacerdote;
		
		//Compila!
		magoCuravel.recuperarVida();
		sacerdoteCuravel.recuperarVida();
		
		//Nao compila. Pois Curavel nao conhece o metodo mostraInfo
		//magoCuravel.mostraInfo();
		
	}

}
