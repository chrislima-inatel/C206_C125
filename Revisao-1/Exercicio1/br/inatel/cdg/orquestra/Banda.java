package br.inatel.cdg.orquestra;

import br.inatel.cdg.administrativo.Empresario;

public class Banda {
	
	private String nome;
	private String genero;
	
	private Empresario empresario;
	private Musica[] musicas;
	private Membro[] membros;
	
	public Banda(String nome, String genero) {
		this.nome = nome;
		this.genero = genero;
		this.musicas = new Musica[5];
		this.membros = new Membro[5];
	}

	//Getters
	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}
	
	//Setters
	public void setEmpresario(Empresario empresario) {
		this.empresario = empresario;
	}

	
	//Metodos adicionais
	public void mostraInfo() {
		System.out.println("Informacoes da Banda!");
		System.out.println("Nome: " + this.nome);
		System.out.println("Genereo: " + this.genero);
		System.out.println("Informacoes dos Membros");
		for (Membro membro : membros) {
			if(membro == null)
				break;
			System.out.println("Nome: " + membro.getNome());
			System.out.println("Funcao: " + membro.getFuncao());
		}
		System.out.println("Informacoes das Musicas");
		for (Musica musica : musicas) {
			if(musica == null)
				break;
			System.out.println("Nome: " + musica.getNome());
			System.out.println("Duracao: " + musica.getDuracao());
		}
		System.out.println("Informacoes Empresario");
		System.out.println("Nome: " + empresario.getNome());
		System.out.println("CNPJ: " + empresario.getCnpj());
	}
	
	public void addMusica(Musica musica) {
		for(int i = 0; i < musicas.length; i++) {
			if(musicas[i] == null) {
				musicas[i] = musica;
				break;
			}
		}
	}
	
	public void addMembro(Membro membro) {
		for (int i = 0; i < membros.length; i++) {
			if(membros[i] == null) {
				membros[i] = membro;
				break;
			}
		}
		
	}
}
