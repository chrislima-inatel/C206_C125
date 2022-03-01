package br.inatel.cdg.exercicio3;

public class Bloco {

    private static int numBlocos = 0;

    public Bloco() {
        numBlocos++;
    }

    public void destruir(){
        System.out.println("Bloco sendo destruido!");
        numBlocos--;
    }

    //Getter
    public static int getNumBlocos() {
        return numBlocos;
    }
}