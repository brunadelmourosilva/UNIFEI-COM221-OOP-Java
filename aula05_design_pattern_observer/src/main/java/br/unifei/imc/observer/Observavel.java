package br.unifei.imc.observer;

public interface Observavel {

    void registraObservador(Observador observador);
    void cancelaObservador(Observador observador);
}
