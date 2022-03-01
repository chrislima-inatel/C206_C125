package br.inatel.cdg.exercicio2;

import br.inatel.cdg.exercicio2.inimigos.CavaleiroNegro;
import br.inatel.cdg.exercicio2.inimigos.CavaleiroPrata;
import br.inatel.cdg.exercicio2.inimigos.ZumbiLerdo;

public class Main {

	public static void main(String[] args) {
		
		ZumbiLerdo zumbi = new ZumbiLerdo("Zumbi Lerdo", 50, "Espada Curta");
		CavaleiroNegro cavNegro = 
				new CavaleiroNegro("Cavaleiro Negro", 150, "Espada Longa");
		CavaleiroPrata cavPrata = 
				new CavaleiroPrata("Cavaleiro Prata", 175, "Silver Sword");
		
		zumbi.atacando();
		cavNegro.atacando();
		cavPrata.atacando();		
	}

}
