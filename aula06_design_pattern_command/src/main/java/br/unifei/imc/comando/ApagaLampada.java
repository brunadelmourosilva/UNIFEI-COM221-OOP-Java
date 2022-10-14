package br.unifei.imc.comando;

import br.unifei.imc.dispositivos.Lampada;

public class ApagaLampada implements Comando{

    Lampada l;

    public ApagaLampada(Lampada l){
        this.l = l;
    }

    @Override
    public void executar() {
        l.apagar();
    }
}
