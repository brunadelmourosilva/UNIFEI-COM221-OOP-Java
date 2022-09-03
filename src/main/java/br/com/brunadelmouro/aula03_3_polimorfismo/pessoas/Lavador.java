package br.com.brunadelmouro.aula03_3_polimorfismo.pessoas;

public class Lavador extends Pessoa {

    private Double lucro;

    public Lavador(final String nome, final String cpf, final Double saldo) {
        super(nome, cpf, saldo);
        this.lucro = 0.0;
    }

    public Double getLucro() {
        return lucro;
    }

    public void setLucro(final Double lucro) {
        this.lucro = lucro;
    }

    public void recebeLucro(Double lucro) {
        this.saldo += lucro;
        this.lucro += lucro;
        System.out.println("Lavador ganha 20% do lucro e seu saldo atual é de: "+ this.saldo);
        System.out.println("Lavador ganha 20% do lucro e seu lucro atual é de: "+ this.lucro);
    }
}
