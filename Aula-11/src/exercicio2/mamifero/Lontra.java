package exercicio2.mamifero;

import exercicio2.interfaces.Aquatico;

public class Lontra extends Mamifero implements Aquatico {

    public Lontra(String nome, double vida) {

        super(nome, vida);
    }

    @Override
    public void emitirSom() {

        System.out.println("Lontra emitindo som!");
    }

    @Override
    public void nadar() {
        System.out.println("Lontra nadando");
    }
}
