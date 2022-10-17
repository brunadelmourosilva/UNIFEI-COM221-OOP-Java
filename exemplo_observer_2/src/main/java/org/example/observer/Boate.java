package org.example.observer;

import org.example.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Boate implements BoateObservavel{

    List<SegurancaObservador> observadores = new ArrayList<>();

    @Override
    public void remove(final SegurancaObservador observador) {
        observadores.remove(observador);
    }

    @Override
    public void adiciona(final SegurancaObservador observador) {
        observadores.add(observador);
    }

    public void atualizaObservadores(Pessoa pessoa) {
        observadores.forEach(
                observador -> {
                        observador.atualiza(pessoa);
                });
    }

    public void setPessoas(Pessoa pessoa){
        atualizaObservadores(pessoa);
    }
}
