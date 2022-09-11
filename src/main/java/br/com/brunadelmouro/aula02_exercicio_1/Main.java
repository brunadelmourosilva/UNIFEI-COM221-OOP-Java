package br.com.brunadelmouro.aula04_exercicio_openCSV;

import br.com.brunadelmouro.aula04_exercicio_openCSV.enums.Platform;
import br.com.brunadelmouro.aula04_exercicio_openCSV.enums.Publisher;
import br.com.brunadelmouro.aula04_exercicio_openCSV.service.GameService;
import br.com.brunadelmouro.aula04_exercicio_openCSV.utils.CsvUtil;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
* Autor(a): Bruna Delmouro - 2021001809
*
* */

public class Main {

    public static void main(String[] args) {
        Path path = Paths.get("vendas-games.csv");

        var gamesByPlatformList = GameService.filterGamesByPlatform(CsvUtil.readCsv(path), Platform.X360.getPlatform());
        gamesByPlatformList.forEach(game -> System.out.println(String.format("%s - %s", game.getPlatform(), game.getName())));

        System.out.println("--------------------------------------");

        var gamesByPublishersList = GameService.filterGamesByPublisher(CsvUtil.readCsv(path), Publisher.NINTENDO.getPublisher());
        gamesByPublishersList.forEach(game -> System.out.println(String.format("%s - %s", game.getPublisher(), game.getName())));
    }
}
