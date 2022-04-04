package br.inatel.cdg.exercicio1;

public class Main{


    public static void main(String args[]){

        Empresario empresario = new Empresario("Seu Madruga",1000021023);

        Musica musica1 = new Musica("Musica1", 3.4f);

        Musica musica2 = new Musica("Musica2", 4.2f);

        Musica musica3 = new Musica("Musica3", 6.2f);

        Membro membro1 = new Membro("Membro1", "Vocalista");

        Membro membro2 = new Membro("Membro2","Guitarrista");

        Membro membro3 = new Membro("Membro3","Baixista");

        Banda banda = new Banda("Bandinha do touro louco","Musica boa");
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