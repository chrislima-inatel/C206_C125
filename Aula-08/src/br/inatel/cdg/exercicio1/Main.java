package br.inatel.cdg.exercicio1;

public class Main{


    public static void main(String args[]){

        Empresario empresario = new Empresario("Jaum Empresario",1000021023);

        Musica musica1 = new Musica("Paranoid", 3.4f);

        Musica musica2 = new Musica("N.I.B", 4.2f);

        Musica musica3 = new Musica("War Pigs", 6.2f);

        Membro membro1 = new Membro("Ozzy", "Vocalista");

        Membro membro2 = new Membro("Tony Iommi","Guitarrista");

        Membro membro3 = new Membro("Geezer","Baixista");

        Banda banda = new Banda("Black Sabbath","Heavy Metal");
        banda.setEmpresario(empresario);
        //Adicionando Musicas
        banda.addMusica(musica1);
        banda.addMusica(musica2);
        banda.addMusica(musica3);
        //Adicionando Membros
        banda.addMembro(membro1);
        banda.addMembro(membro2);
        banda.addMembro(membro3);

        banda.mostraInfo();

    }


}