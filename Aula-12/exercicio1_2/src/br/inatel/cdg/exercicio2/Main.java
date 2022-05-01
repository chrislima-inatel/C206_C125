package br.inatel.cdg.exercicio2;

import br.inatel.cdg.exercicio2.brownie.Brownie;
import br.inatel.cdg.exercicio2.brownie.BrownieCafe;
import br.inatel.cdg.exercicio2.brownie.BrownieDoceDeLeite;
import br.inatel.cdg.exercicio2.brownie.BrownieNutella;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Brownie> listaBrownie = new ArrayList<Brownie>();
		BrownieCafe bwCafe = new BrownieCafe("Brownie de Café", 10, "Café");
		BrownieNutella bwNutella =
				new BrownieNutella("Brownie de Nutella", 70, "Nutella");
		BrownieDoceDeLeite bwDoceLeite =
				new BrownieDoceDeLeite("Brownie Doce de Leite", 15, "Doce de leite");

		listaBrownie.add(bwCafe);
		listaBrownie.add(bwNutella);
		listaBrownie.add(bwDoceLeite);

		for (Brownie brownie : listaBrownie) {
			System.out.println(brownie.getNome() + " : " + brownie.getPreco());
		}

		// Ordena chamando o método sort (static)
		Collections.sort(listaBrownie);

		// Depois de ordenar
		for (Brownie brownie : listaBrownie) {
			System.out.println(brownie.getNome() + " : " + brownie.getPreco());
		}

	}

}
