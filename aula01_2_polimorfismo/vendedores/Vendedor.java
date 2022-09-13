package br.com.brunadelmouro.aula03_2_polimorfismo.vendedores;

public abstract class Vendedor {

    protected double saldo;

    public Vendedor(double saldo) {
        this.saldo = saldo;
    }

    public abstract void lucra(double qtdEsfirra);
}
