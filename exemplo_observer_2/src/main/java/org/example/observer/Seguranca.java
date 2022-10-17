package org.example.observer;

import org.example.Pessoa;

public class Seguranca implements SegurancaObservador{

    private String nomeSeguranca;
    public Seguranca(final String nomeSeguranca) {
        this.nomeSeguranca = nomeSeguranca;
    }

    public String getNomeSeguranca() {
        return nomeSeguranca;
    }

    @Override
    public void atualiza(final Pessoa pessoa) {
        System.out.println("Segurança " + this.nomeSeguranca + " irá dizer...");
        System.out.print("Pessoa " + pessoa.getNome());

        if (pessoa.getIdade() >= 18) {
            System.out.println(" pode entrar");
        } else {
            System.out.println(" não pode entrar");
        }

        System.out.println();
    }
}
