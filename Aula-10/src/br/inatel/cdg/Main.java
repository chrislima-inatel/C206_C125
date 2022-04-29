package br.inatel.cdg;

import br.inatel.cdg.mamifero.Boi;
import br.inatel.cdg.mamifero.Lontra;
import br.inatel.cdg.mamifero.Mamifero;
import br.inatel.cdg.mamifero.Cachorro;

public class Main{

    public static void main(String args[]){
        
        Mamifero cachorro = new Cachorro("Judite", 100);
        Mamifero boi = new Boi("Clovis", 200);
        Mamifero lontra = new Lontra("Eusébio", 78);

        cachorro.emitirSon();
        boi.emitirSon();
        lontra.emitirSon();

        cachorro.mostraInfo();
        boi.mostraInfo();
        lontra.mostraInfo();

    }

}