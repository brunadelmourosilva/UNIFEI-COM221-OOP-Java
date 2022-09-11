package br.com.brunadelmouro.aula03_3_polimorfismo.veiculos;

public abstract class Veiculo {

    private String marca;
    private String cor;
    private String ano;

    public Veiculo(final String marca, final String cor, final String ano) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(final String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(final String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(final String ano) {
        this.ano = ano;
    }
}

