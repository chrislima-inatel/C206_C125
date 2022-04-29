package br.inatel.cdg.animais;

import br.inatel.cdg.interfaces.SerVivo;

public class Humano implements SerVivo {

    public Humano() {
    }

    @Override
    public void comer() {
        System.out.println("Ser vivo se alimentando");
    }
}
