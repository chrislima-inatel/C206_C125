package br.inatel.cdg.exercicio1;

public class Empresario{

    private String nome;
    private long cnpj;
    
    public Empresario(String nome, long cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

}