package org.example.observer;

public class AssinanteRevista implements Observador{

    private String nome;

    @Override
    public void atualiza(final String dado) {
        System.out.println(this.nome + " recebeu revista " + dado);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }
}
