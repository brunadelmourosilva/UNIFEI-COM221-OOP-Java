package br.unifei.imc.asteroide;

import lombok.Getter;

@Getter
public abstract class Asteroide {

    protected double vida;
    protected double velocidade;
    protected int dificuldade;

    public Asteroide(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
