package br.com.brunadelmouro.aula03_1_polimorfismo.jogadores;

import br.com.brunadelmouro.aula03_1_polimorfismo.Arma;
import br.com.brunadelmouro.aula03_1_polimorfismo.inimigos.Inimigo;

public abstract class Jogador {

    protected String nome;
    protected Integer vida;
    protected Arma arma;

    public Jogador(final String nome, final Integer vida, final Arma arma) {
        this.nome = nome;
        this.vida = vida;
        this.arma = arma;
    }

    public abstract void ataca(final Inimigo inimigo);
    public abstract void tomaDano(Integer dano);
    public abstract void morre();
}
