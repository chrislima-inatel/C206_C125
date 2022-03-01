package br.inatel.cdg.jogador;

public abstract class Jogador {

    protected String nome;
    protected double vida;
    protected String tipoArma;

    public Jogador(String nome, double vida, String tipoArma){
        this.nome = nome;
        this.vida = vida;
        this.tipoArma = tipoArma;
    }

    public abstract void atacar();

    public void mostraInfo(){
        System.out.println("Dados da classe Jogador");
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
        System.out.println("String: " + this.tipoArma);
    }
    
}