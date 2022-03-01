package br.inatel.cdg.orquestra;

public class Musica {
	
	private String nome;
	private float duracao;
	
	public static int numMusicas = 0;
		
	
	public Musica(String nome, float duracao) {
		setNome(nome);
		setDuracao(duracao);
		numMusicas++;
	}
	
	//Getter e Setter
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
