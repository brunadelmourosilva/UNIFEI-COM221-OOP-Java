package br.com.brunadelmouro.aula03_polimorfismo.vendedores;

public class Fornecedor extends Vendedor {


    public Fornecedor(double saldo) {
        super(saldo);
    }

    @Override
    public void lucra(double qtdEsfirra) {
        this.saldo += (qtdEsfirra * 3);
        System.out.println("Saldo Fornecedor: " + this.saldo);
    }

    public static void fornece(Baruk baruk){
        baruk.setQtdEstoque(50);
    }

}
