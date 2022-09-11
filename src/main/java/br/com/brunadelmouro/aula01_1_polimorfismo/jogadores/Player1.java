package br.com.brunadelmouro.aula03_1_polimorfismo.jogadores;

import br.com.brunadelmouro.aula03_1_polimorfismo.Arma;
import br.com.brunadelmouro.aula03_1_polimorfismo.inimigos.Inimigo;
import br.com.brunadelmouro.aula03_1_polimorfismo.jogadores.Jogador;

public class Player1 extends Jogador {

    public Player1(final String nome, final Integer vida, final Arma arma) {
        super(nome, vida, arma);
    }

    @Override
    public void ataca(final Inimigo inimigo) {
        inimigo.tomaDano(arma.getDano());
    }

    @Override
    public void tomaDano(final Integer dano) {
        this.vida -= dano;
        System.out.println("\nJogador tomando dano... Vida atual: " + this.vida);

        if(this.vida < 0) {
            morre();
            System.out.println("\nInimigo VENCEU!!!");
        }
    }

    @Override
    public void morre() {
        System.out.println("\nJogador MORREU!!!");
    }
}
