package br.unifei.imc.pagamento;

import br.unifei.imc.produto.Produto;

import java.util.List;

public class Boleto implements Pagamento {

    private double precoTotal = 0.0;

    @Override
    public double calcularPreco(List<Produto> produtos) {
        produtos.forEach(produto -> this.precoTotal += produto.getPreco());

        return this.precoTotal * 0.90;
    }
}
