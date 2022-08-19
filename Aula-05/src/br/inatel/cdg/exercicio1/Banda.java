package br.inatel.cdg.exercicio1;

public class Banda{

    private String nome;
    private String genero;
    private Empresario empresario;
    private Musica[] musicas = new Musica[5];
    private Membro[] membros = new Membro[5];
    
    public Banda(String nome, String genero){
    	this.nome = nome;
        this.genero = genero;
    }

    void addMusica(Musica novaMusica){
        for(int i = 0; i < musicas.length; i++){//Varrendo o array de musicas
            if(musicas[i] == null){//Verifica se não existe musica
                musicas[i] = novaMusica;
                break; //Adiciona e sai do metodo
            }
        }
    }

    void addMembro(Membro novoMembro){
        for(int i = 0; i < membros.length; i++){
            if(membros[i] == null){
                membros[i] = novoMembro;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("A Banda: " + this.nome + " possui os seguintes membros:");
        for (Membro membro : membros) {
            if(membro != null)//Verifica se existe membro antes de imprimir
                System.out.println(membro.getNome());
        }
        System.out.println("A Banda: " + this.nome + " possui as seguintes musicas:");
        for (Musica musica : musicas) {
            if(musica != null)//Verifica se existe musica antes de imprimir
                System.out.println(musica.getNome());
        }
    }
    
    public void setEmpresario(Empresario empresario) {
    	this.empresario = empresario;
    }

}