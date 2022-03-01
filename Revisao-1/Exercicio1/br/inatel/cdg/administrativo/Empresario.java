package br.inatel.cdg.administrativo;

public class Empresario {

	private String nome;
	private long cnpj;
	
	public Empresario(String nome, long cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}

	//Getters
	public String getNome() {
		return nome;
	}

	public long getCnpj() {
		return cnpj;
	}
	
	
}
