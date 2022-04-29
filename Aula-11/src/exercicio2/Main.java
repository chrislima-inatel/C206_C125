package exercicio2;

import exercicio2.mamifero.Boi;
import exercicio2.mamifero.Cachorro;
import exercicio2.mamifero.Lontra;
import exercicio2.mamifero.Mamifero;

public class Main{

    public static void main(String args[]){

        Mamifero cachorro = new Cachorro("Judite", 100);
        Mamifero boi = new Boi("Clovis", 200);
        Lontra lontra = new Lontra("Eusébio", 78);

        cachorro.emitirSom();
        boi.emitirSom();
        lontra.emitirSom();
        lontra.nadar();

        cachorro.mostraInfo();
        boi.mostraInfo();
        lontra.mostraInfo();

    }

}
