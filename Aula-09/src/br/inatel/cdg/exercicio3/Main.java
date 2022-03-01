package br.inatel.cdg.exercicio3;

import br.inatel.cdg.exercicio3.inimigos.CavaleiroNegro;
import br.inatel.cdg.exercicio3.inimigos.CavaleiroPrata;
import br.inatel.cdg.exercicio3.inimigos.ZumbiLerdo;
import br.inatel.cdg.exercicio3.jogador.Jogador;

public class Main {

	public static void main(String[] args) {
		
		ZumbiLerdo zumbi = new ZumbiLerdo("Zumbi Lerdo", 50, "Espada Curta");
		CavaleiroNegro cavNegro = 
				new CavaleiroNegro("Cavaleiro Negro", 150, "Espada Longa");
		CavaleiroPrata cavPrata = 
				new CavaleiroPrata("Cavaleiro Prata", 175, "Silver Sword");
		
		Jogador jogador = new Jogador("Chuck Norris", 100000000);
		
		System.out.println("Verificando a vida dos inimigos ANTES do ataque.");
		System.out.println("Vida do " + zumbi.getNome() + " : " + zumbi.getVida());
		System.out.println("Vida do " + cavNegro.getNome() + " : " + cavNegro.getVida());
		System.out.println("Vida do " + cavPrata.getNome() + " : " + cavPrata.getVida());

		jogador.atacar(zumbi);
		jogador.atacar(cavNegro);
		jogador.atacar(cavPrata);

		System.out.println("Verificando a vida dos inimigos APOS o ataque.");
		System.out.println("Vida do " + zumbi.getNome() + " : " + zumbi.getVida());
		System.out.println("Vida do " + cavNegro.getNome() + " : " + cavNegro.getVida());
		System.out.println("Vida do " + cavPrata.getNome() + " : " + cavPrata.getVida());
	}
}