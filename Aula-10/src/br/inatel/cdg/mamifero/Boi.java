package br.inatel.cdg.mamifero;

public class Boi extends Mamifero {

    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSon() {
        System.out.println("Boi emitindo son!");
    }

}