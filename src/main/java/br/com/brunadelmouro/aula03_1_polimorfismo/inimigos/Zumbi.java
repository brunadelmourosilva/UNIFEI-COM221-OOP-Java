package br.com.brunadelmouro.aula03_1_polimorfismo.inimigos;

import br.com.brunadelmouro.aula03_1_polimorfismo.Arma;
import br.com.brunadelmouro.aula03_1_polimorfismo.jogadores.Jogador;

public class Zumbi extends Inimigo {


    public Zumbi(final String nome, final Integer vida, final Arma arma) {
        super(nome, vida, arma);
    }

    @Override
    public void ataca(final Jogador jogador) {
        //tirar vida do jogador
        jogador.tomaDano(arma.getDano());
    }

    @Override
    public void tomaDano(final Integer dano) {
        this.vida -= dano;
        System.out.println("\nInimigo tomando dano... Vida atual: " + this.vida);

        if(this.vida < 0) {
            morre();
            System.out.println("\nJogador VENCEU!!!");
        }
    }

    @Override
    public void morre() {
        System.out.println("\nInimigo MORREU!!!");
    }
}
