package br.inatel.cdg.utils;

import br.inatel.cdg.model.Game;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CsvUtils {

    public static List<Game> readGameCsv(Path csvFilePath){

        List<Game> gameList = new ArrayList<>();

        try {
            Reader reader = Files.newBufferedReader(csvFilePath);
            CsvToBean<Game> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Game.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            gameList = csvToBean.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gameList;
    }

}