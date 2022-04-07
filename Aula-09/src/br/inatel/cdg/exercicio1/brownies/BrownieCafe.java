package br.inatel.cdg.exercicio1.brownies;

public class BrownieCafe extends Brownie {
	
	public BrownieCafe(String nome, double preco, String sabor) {
		super(nome,preco,sabor);
	}

	public void adicionaCafe() {
		System.out.println(super.nome +" adicionando mais café");
	}
}