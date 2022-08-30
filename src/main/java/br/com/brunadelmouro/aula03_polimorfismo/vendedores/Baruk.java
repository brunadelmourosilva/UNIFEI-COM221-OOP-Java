package br.com.brunadelmouro.aula03_polimorfismo.vendedores;

public class Baruk extends Vendedor {

    private double qtdEstoque;

    public Baruk(double saldo, double qtdEstoque) {
        super(saldo);
        this.qtdEstoque = qtdEstoque;
    }


    @Override
    public void lucra(double qtdEsfirra) {
        this.saldo += (qtdEsfirra * 2);
        System.out.println("Saldo Baruk: " + this.saldo);
    }

    public void vende(double qtdEstoque){
        this.qtdEstoque -= qtdEstoque;

        if(this.qtdEstoque < 10) {
            Fornecedor.fornece(this);
            System.out.println("Repondo estoque...");
        }
    }

    public double getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(double qtdEstoque) {
        this.qtdEstoque += qtdEstoque;
    }
}
