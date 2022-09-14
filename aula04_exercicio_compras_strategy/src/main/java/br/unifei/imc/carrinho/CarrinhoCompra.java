package br.unifei.imc.carrinho;

import br.unifei.imc.pagamento.Boleto;
import br.unifei.imc.pagamento.Pagamento;
import br.unifei.imc.produto.Produto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CarrinhoCompra {

    private List<Produto> produtos;
    private double precoTotal;
    @Setter
    private Pagamento tipoPagamento;

    public CarrinhoCompra() {
        this.produtos  = new ArrayList<>();
        this.tipoPagamento = new Boleto(); //o tipo padrão para pagamento é boleto
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void calcularPreco() {
        this.precoTotal = this.tipoPagamento.calcularPreco(this.produtos);
    }
}
