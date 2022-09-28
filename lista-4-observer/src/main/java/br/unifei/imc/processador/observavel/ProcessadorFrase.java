package br.unifei.imc.processador.observavel;

import br.unifei.imc.processador.exception.SemProcessadoresException;
import br.unifei.imc.processador.observadores.Observador;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorFrase implements Observavel {

    @Getter
    List<Observador> observadores;

    public ProcessadorFrase() {
        this.observadores = new ArrayList<>();
    }

    public void processar(String frase) {
        if(this.observadores.isEmpty())
            throw new SemProcessadoresException();

        var palavras = frase.split(" ");

        for (String palavra : palavras) {
            this.observadores
                    .forEach(observador -> observador.atualiza(palavra));
        }
    }

    @Override
    public void registrar(Observador observador) {
        this.observadores.add(observador);
    }

    @Override
    public void cancelar(Observador observador) {
        this.observadores.remove(observador);
    }
}
