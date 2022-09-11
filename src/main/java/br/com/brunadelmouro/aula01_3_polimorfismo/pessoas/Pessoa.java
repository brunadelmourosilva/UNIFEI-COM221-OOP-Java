package br.com.brunadelmouro.aula03_3_polimorfismo.pessoas;

public abstract class Pessoa {

    private String nome;
    private String cpf;
    protected Double saldo;

    public Pessoa(final String nome, final String cpf, final Double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(final String cpf) {
        this.cpf = cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(final Double saldo) {
        this.saldo = saldo;
    }
}
