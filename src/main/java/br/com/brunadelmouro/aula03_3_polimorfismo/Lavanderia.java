package br.com.brunadelmouro.aula03_3_polimorfismo;

import br.com.brunadelmouro.aula03_3_polimorfismo.pessoas.Cliente;
import br.com.brunadelmouro.aula03_3_polimorfismo.pessoas.Lavador;
import br.com.brunadelmouro.aula03_3_polimorfismo.pessoas.Pessoa;
import br.com.brunadelmouro.aula03_3_polimorfismo.veiculos.Caminhao;
import br.com.brunadelmouro.aula03_3_polimorfismo.veiculos.Carro;
import br.com.brunadelmouro.aula03_3_polimorfismo.veiculos.Moto;
import br.com.brunadelmouro.aula03_3_polimorfismo.veiculos.Veiculo;

public class Lavanderia {

    private String nome;
    private Double caixa;

    public Lavanderia(final String nome, final Double caixa) {
        this.nome = nome;
        this.caixa = caixa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public Double getCaixa() {
        return caixa;
    }

    public void setCaixa(final Double caixa) {
        this.caixa = caixa;
    }

    public void lavaVeiculo(final Veiculo veiculo, final Cliente cliente, final Lavador lavador) {
        double valorLavagem = 0.0;
        if(veiculo instanceof Moto) valorLavagem = 50.0;
        if(veiculo instanceof Carro) valorLavagem = 100.0;
        if(veiculo instanceof Caminhao) valorLavagem = 200.0;

        System.out.println("Lavando veículo " + veiculo.getMarca() + " com o valor de " + valorLavagem + "...");

        //lavanderia ganha 80%
        //lavador ganha 20% no seu saldo + atribuir lucro
        this.caixa += (valorLavagem * 0.80);
        System.out.println("Lavanderia ganha 80% do lucro e seu caixa atual é de: " + this.caixa);

        lavador.recebeLucro(valorLavagem * 0.20);

        //cliente tem desconto do seu saldo
        cliente.descontaSaldo(valorLavagem, veiculo.getClass().toString());
    }
}
