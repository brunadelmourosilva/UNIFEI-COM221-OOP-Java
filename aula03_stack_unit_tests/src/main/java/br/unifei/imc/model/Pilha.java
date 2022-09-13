package br.unifei.imc.model;

import br.unifei.imc.exception.PilhaVaziaException;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {

    @Getter
    private int tamanho;
    private List<T> elementos;

    public Pilha() {
        this.elementos = new ArrayList<>();
    }

    public boolean isVazia() {
        return this.tamanho == 0;
    }

    public void push(T elemento) {
        elementos.add(elemento);
        this.tamanho++;
    }

    public T mostraTopo() {
        return this.elementos.get(this.tamanho - 1);
    }

    public void pop() {
        if(!isVazia())
            this.elementos.remove(--this.tamanho);
        else
            throw new PilhaVaziaException();
    }
}
