package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Revista implements Observavel{

    private String versaoRevista;
    List<Observador> observadores = new ArrayList<>();

    @Override
    public void adicionaObservador(final Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removeObservador(final Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void atualizarObservadores() {
        observadores.forEach(observador -> observador.atualiza(this.versaoRevista));
    }

    public void setVersaoRevista(final String versaoRevista) {
        this.versaoRevista = versaoRevista;
        atualizarObservadores();
    }
}
