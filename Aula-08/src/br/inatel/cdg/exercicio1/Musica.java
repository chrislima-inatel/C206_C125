package br.inatel.cdg.exercicio1;

public class Musica{

    private String nome;
    private float duracao;
    
    public Musica(String nome, float duracao) {
		this.nome = nome;
		this.duracao = duracao;
	}
	//Getter e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}

    
    
}