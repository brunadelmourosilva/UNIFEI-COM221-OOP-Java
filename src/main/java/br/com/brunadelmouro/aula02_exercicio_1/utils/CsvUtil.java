package br.com.brunadelmouro.aula04_exercicio_openCSV.utils;


import br.com.brunadelmouro.aula04_exercicio_openCSV.model.Game;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CsvUtil {

    public static List<Game> readCsv(Path csvFilePath) {
        List<Game> gameFullList = new ArrayList<>();

        try {
            Reader reader = Files.newBufferedReader(csvFilePath);

            CsvToBean<Game> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Game.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            gameFullList = csvToBean.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return gameFullList;
    }
}
