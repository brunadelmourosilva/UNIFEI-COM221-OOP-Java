package br.unifei.imc.comando;

import br.unifei.imc.dispositivos.Garagem;

public class FecharGaragem implements Comando{

    Garagem g;

    public FecharGaragem(Garagem g){
        this.g = g;
    }

    @Override
    public void executar() {
        g.fechar();
    }
}
