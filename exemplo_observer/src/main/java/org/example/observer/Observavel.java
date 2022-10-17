package org.example.observer;

public interface Observavel {

    void adicionaObservador(Observador observador);
    void removeObservador(Observador observador);

    void atualizarObservadores();
}
