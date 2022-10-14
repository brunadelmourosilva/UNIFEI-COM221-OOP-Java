package br.unifei.imc.comando;

import br.unifei.imc.dispositivos.Lampada;

public class AcendeLampada implements Comando{

    Lampada l;

    public AcendeLampada(Lampada l){
        this.l = l;
    }

    @Override
    public void executar() {
        l.acender();
    }
}
