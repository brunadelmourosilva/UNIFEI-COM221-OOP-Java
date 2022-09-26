package br.unifei.imc.display;

import br.unifei.imc.clima.ClimaDados;
import br.unifei.imc.observer.Observador;

public class Previsao implements Display, Observador {

    private ClimaDados climaDados;
    private double temperaturaAtual;
    private double temperaturaAntiga;


    public Previsao(ClimaDados climaDados, double tempReferencia) {
        this.climaDados = climaDados;
        this.temperaturaAtual = tempReferencia;
        climaDados.registraObservador(this);
    }

    @Override
    public void mostra() {
        System.out.println("Temperatura mudou de "
                + temperaturaAntiga + " para " + temperaturaAtual);
        System.out.print("Previsão: ");
        if (temperaturaAtual > temperaturaAntiga) {
            System.out.println("Pode esquentar. Fique em casa jogando");
        } else if (temperaturaAntiga == temperaturaAtual) {
            System.out.println("Sem novidades. Mais do mesmo!");
        } else if (temperaturaAtual < temperaturaAntiga) {
            System.out.println("Pode esfriar. Fique em casa montando puzzle!");
        }
    }

    @Override
    public void atualiza(double temp, double pressao, double umidade) {
        temperaturaAntiga = temperaturaAtual;
        temperaturaAtual = temp;
        mostra();
    }
}
