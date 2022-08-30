package br.com.brunadelmouro.aula03_1_polimorfismo;

import br.com.brunadelmouro.aula03_1_polimorfismo.inimigos.Zumbi;
import br.com.brunadelmouro.aula03_1_polimorfismo.jogadores.Player1;

public class Main {

    public static void main(String[] args) {

        Arma armaDoJogador = new Arma(500);
        Player1 player1 = new Player1("Alex", 1000, armaDoJogador);

        Arma armaDoInimigo = new Arma(5);
        Zumbi zumbi = new Zumbi("Zumbi", 50, armaDoInimigo);

        zumbi.ataca(player1);
        zumbi.ataca(player1);
        zumbi.ataca(player1);
        zumbi.ataca(player1);
        zumbi.ataca(player1);
        zumbi.ataca(player1);

        player1.ataca(zumbi);
    }
}
