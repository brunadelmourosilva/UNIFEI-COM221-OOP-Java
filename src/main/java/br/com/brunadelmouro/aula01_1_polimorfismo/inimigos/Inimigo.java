package br.com.brunadelmouro.aula03_1_polimorfismo.inimigos;

import br.com.brunadelmouro.aula03_1_polimorfismo.Arma;
import br.com.brunadelmouro.aula03_1_polimorfismo.jogadores.Jogador;

public abstract class Inimigo {
    protected String nome;
    protected Integer vida;
    protected Arma arma;

    public Inimigo(final String nome, final Integer vida, final Arma arma) {
        this.nome = nome;
        this.vida = vida;
        this.arma = arma;
    }

    public abstract void ataca(Jogador jogador);
    public abstract void tomaDano(Integer dano);
    public abstract void morre();
}
