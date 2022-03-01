package br.inatel.cdg.exercicio3;

public class Jogador{

    private int ponto;

    public void destruirBloco(Bloco bloco){
        bloco.destruir();
        ponto++;
    }

    public int getPonto(){
        return this.ponto;
    }

    
}