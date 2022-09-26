package br.unifei.imc;

import br.unifei.imc.clima.ClimaDados;
import br.unifei.imc.display.CondicoesAtuais;
import br.unifei.imc.display.Display;
import br.unifei.imc.display.Previsao;

public class Main {
    public static void main(String[] args) {


        ClimaDados clima = new ClimaDados();

        Display correnteDisplay = new CondicoesAtuais(clima);
        Display previsaoDisplay = new Previsao(clima,19);

        clima.setMudancas(15, 65, 30);
        clima.setMudancas(17, 90, 29.4);
    }
}