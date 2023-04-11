package br.inatel.cdg.exercicio3.brownies;

public class BrownieCafe extends Brownie {
	
	public BrownieCafe(String nome, double preco, String sabor) {
		super(nome,preco,sabor);
	}

	public void adicionaCafe() {
		System.out.println(super.nome +" adicionando mais café");
	}

	@Override
	public void addCarrinhoDeCompras(){
		System.out.println("Brownie de café sendo adicionado");
	}
}