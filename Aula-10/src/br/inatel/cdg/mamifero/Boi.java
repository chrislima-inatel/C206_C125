package br.inatel.cdg.mamifero;

public class Boi extends Mamifero {

    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Boi emitindo som!");
    }

}