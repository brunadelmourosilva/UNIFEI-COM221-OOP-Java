package br.unifei.imc;

import br.unifei.imc.aplicacao.BoardGame;
import br.unifei.imc.framework.validators.Processador;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        var boardGame = new BoardGame(5, 600, "Zombicide");

        Map<String, Object> mapa = Processador.gerarMapa(boardGame);

        mapa.forEach((k, v) -> {
            System.out.println("Campo: " + k + " Valor: " + v);
        });
    }
}