package br.inatel.cdg.exercicio1;

import br.inatel.cdg.exercicio1.brownies.BrownieNutella;
import br.inatel.cdg.exercicio1.brownies.BrownieDoceDeLeite;
import br.inatel.cdg.exercicio1.brownies.BrownieCafe;

public class Main {

	public static void main(String[] args) {
		
		BrownieCafe bwCafe = new BrownieCafe("Brownie de Café", 10, "Café");
		BrownieNutella bwNutella =
				new BrownieNutella("Brownie de Nutella", 70, "Nutella");
		BrownieDoceDeLeite bwDoceLeite =
				new BrownieDoceDeLeite("Brownie Doce de Leite", 15, "Doce de leite");


		bwNutella.adicionaNutella();
		bwCafe.adicionaCafe();
		bwDoceLeite.adicionaDoceDeLeite();
		System.out.println(" ");
		bwCafe.mostraInfo();
		bwDoceLeite.mostraInfo();
		bwNutella.mostraInfo();
		System.out.println(" ");
		bwNutella.addCarrinhoDeCompras();
		bwNutella.calculaValorTotalCompra();
		bwCafe.calculaValorTotalCompra();
		bwDoceLeite.calculaValorTotalCompra();

	}

}
