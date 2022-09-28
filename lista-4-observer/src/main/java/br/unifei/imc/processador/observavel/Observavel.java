package br.unifei.imc.processador.observavel;

import br.unifei.imc.processador.observadores.Observador;

public interface Observavel {

    void registrar(Observador observador);
    void cancelar(Observador observador);
}
