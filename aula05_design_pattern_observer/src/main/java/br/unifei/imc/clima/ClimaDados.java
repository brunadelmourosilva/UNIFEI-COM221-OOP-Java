package br.unifei.imc.clima;


import br.unifei.imc.observer.Observador;
import br.unifei.imc.observer.Observavel;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ClimaDados implements Observavel {

    private double temp, umidade, pressao;
    private List<Observador> observadores;

    public ClimaDados() {
        this.observadores = new ArrayList<>();
    }

    @Override
    public void registraObservador(Observador observador) {
        this.observadores.add(observador);
    }

    @Override
    public void cancelaObservador(Observador observador) {
        this.observadores.remove(observador);
    }

    public void notificaAssinantes() {
        this.observadores.forEach(obs -> obs.atualiza(this.temp, this.pressao, this.umidade));
    }

    public void setMudancas(double temp, double pressao, double umidade) {
        this.temp = temp;
        this.pressao = pressao;
        this.umidade = umidade;
        notificaAssinantes();
    }
}
