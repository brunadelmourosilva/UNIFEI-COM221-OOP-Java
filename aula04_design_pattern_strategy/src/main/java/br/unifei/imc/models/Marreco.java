package br.unifei.imc.models;

import br.unifei.imc.interfaces.quack.QuackPadrao;
import br.unifei.imc.interfaces.voar.VooPadrao;

public class Marreco extends Pato {

    public Marreco() {
        this.voar = new VooPadrao();
        this.quack = new QuackPadrao();
    }

    @Override
    public void mostrar() {
        System.out.println("Pato Marreco se apresentando!");
    }


}
