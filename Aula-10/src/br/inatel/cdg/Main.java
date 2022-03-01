package br.inatel.cdg;

import br.inatel.cdg.jogador.Arqueiro;
import br.inatel.cdg.jogador.Guerreiro;
import br.inatel.cdg.jogador.Jogador;
import br.inatel.cdg.jogador.Mago;

public class Main{

    public static void main(String args[]){
        
        Jogador mago = new Mago("Mago Implacavel", 75, "Cajado");
        Jogador arqueiro = new Arqueiro("Cacador", 78, "Arco");
        Jogador guerreiro = new Guerreiro("Guerreiro", 78, "Machado");

        mago.atacar();
        arqueiro.atacar();
        guerreiro.atacar();

        mago.mostraInfo();
        arqueiro.mostraInfo();
        guerreiro.mostraInfo();

    }

}