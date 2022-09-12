package br.unifei.imc.models;

import br.unifei.imc.interfaces.quack.QuackBrincadeira;
import br.unifei.imc.interfaces.voar.NaoSabeVoar;

public class Borracha extends Pato {

    public Borracha() {
        this.voar = new NaoSabeVoar();
        this.quack = new QuackBrincadeira();
    }

    @Override
    public void mostrar() {
        System.out.println("Pato Borracha se apresentando!");
    }
}
