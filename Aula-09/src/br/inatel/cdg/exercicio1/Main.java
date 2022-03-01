package br.inatel.cdg.exercicio1;

import br.inatel.cdg.exercicio1.inimigos.CavaleiroNegro;
import br.inatel.cdg.exercicio1.inimigos.CavaleiroPrata;
import br.inatel.cdg.exercicio1.inimigos.ZumbiLerdo;

public class Main {

	public static void main(String[] args) {
		
		ZumbiLerdo zumbi = new ZumbiLerdo("Zumbi Lerdo", 50, "Espada Curta");
		CavaleiroNegro cavNegro = 
				new CavaleiroNegro("Cavaleiro Negro", 150, "Espada Longa");
		CavaleiroPrata cavPrata = 
				new CavaleiroPrata("Cavaleiro Prata", 175, "Silver Sword");
		
		zumbi.atacando();
		
		cavNegro.ataqueRapido();
		cavPrata.ataqueForte();
		
		System.out.println(cavPrata.getVida());
		System.out.println(zumbi.getVida());
	}

}
