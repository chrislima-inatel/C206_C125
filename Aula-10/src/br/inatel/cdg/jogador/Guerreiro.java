package br.inatel.cdg.jogador;

public class Guerreiro extends Jogador {

    public Guerreiro(String nome, double vida, String tipoArma) {
        super(nome, vida, tipoArma);
    }

    @Override
    public void atacar() {
        System.out.println("Guerreiro Atacando!");
    }

}