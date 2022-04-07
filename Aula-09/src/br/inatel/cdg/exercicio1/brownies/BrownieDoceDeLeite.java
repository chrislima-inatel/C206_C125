package br.inatel.cdg.exercicio1.brownies;


public class BrownieDoceDeLeite extends Brownie {

	public BrownieDoceDeLeite(String nome, double preco, String sabor) {
		super(nome, preco, sabor);
	}
	
	public void adicionaDoceDeLeite() {
		System.out.println(super.nome +" adicionando mais doce de leite!!");

	}

}
