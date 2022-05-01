package br.inatel.cdg.exercicio2.brownie;

public class Brownie implements Comparable <Brownie> {

	protected String nome;
	protected double preco;
	protected String sabor;

	@Override
	public int compareTo(Brownie o) {
		if(this.preco < o.getPreco()){
			return -1;
		}
		if(this.preco > o.getPreco()){
			return 1;
		}
		return 0;
	}

	public Brownie(String nome, double preco, String sabor) {
		this.nome = nome;
		this.preco = preco;
		this.sabor = sabor;
	}

	public void addCarrinhoDeCompras() {

		System.out.println("Adicionando no carrinho de compras um: "+ nome);
	}

	public void calculaValorTotalCompra() {
		System.out.println("Calculando valor total da compra de um: "+ nome +": "+preco);
	}

	public void mostraInfo(){
		System.out.println("Nome do produto: "+ nome);
		System.out.println("Preço do produto: "+preco);
		System.out.println("Sabor do produto: "+sabor);
		System.out.println(" ");
	}



	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public String getSabor() {
		return sabor;
	}

}
