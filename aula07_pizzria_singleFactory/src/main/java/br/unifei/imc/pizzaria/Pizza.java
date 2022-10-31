package br.unifei.imc.pizzaria;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Pizza {

    protected String tamanho;
    protected int pedaco;

    public void preparar() {
        System.out.println("Sabor: " + this.getClass().getSimpleName());
        System.out.println("Preparando...");
        System.out.println("Assando...");
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Pedaços: " + pedaco);
    }
}
