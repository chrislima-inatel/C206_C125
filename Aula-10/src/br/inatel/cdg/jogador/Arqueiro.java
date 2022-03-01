package br.inatel.cdg.jogador;

public class Arqueiro extends Jogador {

    public Arqueiro(String nome, double vida, String tipoArma) {
        super(nome, vida, tipoArma);
    }

    @Override
    public void atacar() {
        System.out.println("Arqueiro Atacando!");
    }

}