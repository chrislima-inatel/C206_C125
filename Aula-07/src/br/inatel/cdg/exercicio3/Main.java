package br.inatel.cdg.exercicio3;

public class Main{

    public static void main(String args[]){

        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();
        Bloco bloco4 = new Bloco();

        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());

        Jogador jogador = new Jogador();
        jogador.destruirBloco(bloco1);

        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontos do jogador: " + jogador.getPonto());

        jogador.destruirBloco(bloco2);

        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontos do jogador: " + jogador.getPonto());

        jogador.destruirBloco(bloco3);
        jogador.destruirBloco(bloco4);

        //Chama o método estático - sem a necessidade de uma instancia.
        Conversor.converter(100);

    }

}