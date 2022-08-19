package br.inatel.cdg.exercicio1;

public class Membro{

	private String nome, funcao;
   
	public Membro(String nome, String funcao) {
		this.nome = nome;
		this.funcao = funcao;
	}

	//Getters e Setter
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getFuncao() {
		return funcao;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}