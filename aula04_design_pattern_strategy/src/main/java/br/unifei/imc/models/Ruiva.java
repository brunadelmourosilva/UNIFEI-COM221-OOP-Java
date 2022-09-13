package br.unifei.imc.models;

import br.unifei.imc.interfaces.quack.QuackPadrao;
import br.unifei.imc.interfaces.voar.VooPadrao;

public class Ruiva extends Pato {

    public Ruiva() {
        this.voar = new VooPadrao();
        this.quack = new QuackPadrao();
    }

    @Override
    public void mostrar() {
        System.out.println("Pato Ruiva se apresentando!");
    }

    @Override
    public void quack() {
        System.out.println("Quack padrão");
    }

    @Override
    public void voar() {

    }
}
