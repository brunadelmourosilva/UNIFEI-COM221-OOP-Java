package br.unifei.imc.interfaces.quack;

public class QuackPadrao implements Quack {
    @Override
    public void quack() {
        System.out.println("Quack padrão!");
    }
}
