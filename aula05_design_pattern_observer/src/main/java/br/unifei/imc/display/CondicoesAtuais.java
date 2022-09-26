package br.unifei.imc.display;

import br.unifei.imc.clima.ClimaDados;
import br.unifei.imc.observer.Observador;

public class CondicoesAtuais implements Display, Observador {

    private double temp, umidade, pressao;

    private ClimaDados climaDados;

    public CondicoesAtuais(ClimaDados climaDados) {
        this.climaDados = climaDados;
        this.climaDados.registraObservador(this);
    }

    @Override
    public void mostra() {
        System.out.println("Condições atuais");
        System.out.println("Temperatura: " + this.temp);
        System.out.println("Pressão: " + this.pressao);
        System.out.println("Umidade: " + this.umidade);
    }

    @Override
    public void atualiza(double temp, double pressao, double umidade) {
        this.temp = temp;
        this.pressao = pressao;
        this.umidade = umidade;
        mostra();
    }
}
