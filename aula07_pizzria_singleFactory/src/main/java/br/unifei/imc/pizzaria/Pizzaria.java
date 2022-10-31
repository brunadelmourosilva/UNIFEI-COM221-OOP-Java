package br.unifei.imc.pizzaria;

import lombok.Setter;

public class Pizzaria {

    @Setter
    private FabricaSingleFactory factory;

    public Pizzaria(FabricaSingleFactory factory) {
        this.factory = factory;
    }

    public Pizza encomendarPizza(String tipo, String tamanho, int pedaco) {
        Pizza pizza = null;

        pizza = factory.criaPizza(tipo, tamanho, pedaco);

        pizza.preparar(); //todo corrigir

        return pizza;
    }
}
