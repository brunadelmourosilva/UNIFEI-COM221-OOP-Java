package br.unifei.imc.models;

import br.unifei.imc.interfaces.quack.Quack;
import br.unifei.imc.interfaces.voar.Voar;

public abstract class Pato {

    /* programe para uma interface e não para uma classe concreta */
    /* prefira composição do que herança */
    protected Voar voar;
    protected Quack quack;

    public abstract void mostrar();

    public void nadar() {
        System.out.println("Pato: " + this.getClass().getSimpleName() + " nadando!");
    }

    //delegação de método
    public void voar() {
        voar.voar();
    }

    //delegação de método
    public void quack() {
        quack.quack();
    }

    public void setVoar(Voar voar) {
        this.voar = voar;
    }

    public void setQuack(Quack quack) {
        this.quack = quack;
    }
}
