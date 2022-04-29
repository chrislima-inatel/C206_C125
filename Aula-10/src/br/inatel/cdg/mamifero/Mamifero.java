package br.inatel.cdg.mamifero;

public abstract class Mamifero {

    protected String nome;
    protected double vida;

    public Mamifero(String nome, double vida){
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void emitirSon();

    public void mostraInfo(){
        System.out.println("Dados da classe Mamifero");
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
    }
    
}