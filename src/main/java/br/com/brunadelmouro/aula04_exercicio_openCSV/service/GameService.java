package br.com.brunadelmouro.aula04_exercicio_openCSV.service;


import br.com.brunadelmouro.aula04_exercicio_openCSV.model.Game;

import java.util.List;
import java.util.stream.Collectors;

public class GameService {

    public static List<Game> filterGamesByPlatform(List<Game> allGamesInCsv, String platform) {

        return allGamesInCsv.stream()
                .filter(game -> game.getPlatform().equals(platform))
                .collect(Collectors.toList());
    }

    public static List<Game> filterGamesByPublisher(List<Game> allGamesInCsv, String publisher) {

        return allGamesInCsv.stream()
                .filter(game -> game.getPublisher().equals(publisher))
                .collect(Collectors.toList());
    }
}
