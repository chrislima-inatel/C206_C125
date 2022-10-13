package br.inatel.cdg.exercicio2.brownie;

public abstract class Brownie implements Comparable <Brownie> {

	protected String nome;
	protected int preco;
	protected String sabor;

	@Override
	public int compareTo(Brownie o) {
		return Integer.compare(o.getPreco(), this.preco);
	}

	public Brownie(String nome, int preco, String sabor) {
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

	public int getPreco() {
		return preco;
	}

	public String getSabor() {
		return sabor;
	}

}
