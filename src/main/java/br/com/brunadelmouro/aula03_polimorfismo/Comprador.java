package br.com.brunadelmouro.aula03_polimorfismo;

import br.com.brunadelmouro.aula03_polimorfismo.vendedores.Baruk;

public class Comprador {

    private Baruk baruk;

    public Comprador( Baruk baruk) {
        this.baruk = baruk;
    }

    public void compra(double qtdEsfirra, Baruk baruk) {
        System.out.println("Comprando " + qtdEsfirra + " esfirras...");
        baruk.lucra(qtdEsfirra);
        baruk.vende(qtdEsfirra);
    }
}
