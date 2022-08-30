package br.com.brunadelmouro.vendedores;

public abstract class Vendedor {

    protected double saldo;

    public Vendedor(double saldo) {
        this.saldo = saldo;
    }

    public abstract void lucra(double qtdEsfirra);
}
