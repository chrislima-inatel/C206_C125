package br.inatel.cdg;

import br.inatel.cdg.model.Game;
import br.inatel.cdg.model.Platform;
import br.inatel.cdg.model.Publisher;
import br.inatel.cdg.service.ServiceGame;
import br.inatel.cdg.utils.CsvUtils;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Path caminho = null;
        try {
            caminho = Paths.get(ClassLoader.getSystemResource("vendas-games.csv").toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        List<Game> gameList = CsvUtils.readGameCsv(caminho);


        int numLines = gameList.size();
        System.out.println("Numero de linhas: " + numLines);

        List<Game> ps4Games = ServiceGame.getListByPlatform(gameList, Platform.PS4);

        System.out.println("Numero de jogos de ps4: " + ps4Games.size());
        ps4Games.forEach(e -> System.out.println(e.getName()));//imprimindo o nome dos jogos de ps4
        System.out.println("");
        List<Game> activisionGames = ServiceGame.getByPuBlisher(gameList, Publisher.Activision);
        System.out.println("Numero de jogos da activision: " + activisionGames.size());
        activisionGames.forEach(e -> System.out.println(e.getName()));//imprimindo o nome dos jogos da activison

    }

}
