package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class MainNave{

    public static void main(String args[]){

        Nave nave1 = new Nave("Nave1", 100, "Explosivo");
        Nave nave2 = new Nave("Nave2", 90, "Normal");

        Asteroide ast1 = new Asteroide("Asteroide1", "Grande");
        Asteroide ast2 = new Asteroide("Asteroide2", "Pequeno");

        nave1.atirar(ast1);
        nave1.atirar(ast2);
        

        //Nave 2 atirando
        nave2.atirar(ast1);
        nave2.atirar(ast2);

    }

}