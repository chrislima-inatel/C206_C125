package br.inatel.cdg.orquestra;

public class Membro {
	
	private String nome;
	private String funcao;
	
	public Membro(String nome, String funcao) {
		this.nome = nome;
		this.funcao = funcao;
	}

	//Getters
	public String getNome() {
		return nome;
	}

	public String getFuncao() {
		return funcao;
	}
	

}
