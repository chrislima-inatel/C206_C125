package br.inatel.cdg.jogador;

public class Mago extends Jogador {

    public Mago(String nome, double vida, String tipoArma) {
        super(nome, vida, tipoArma);
    }

    @Override
    public void atacar() {
        System.out.println("Mago Atacando!");

    }

}