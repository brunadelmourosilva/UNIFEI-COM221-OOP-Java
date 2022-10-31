package br.unifei.imc.pizzaria;

import br.unifei.imc.PizzaFrango;

import java.util.Objects;

public class FabricaSingleFactory {

    public Pizza criaPizza(String tipo, String tamanho, int pedaco) {
        Pizza pizza = null;

        if(Objects.equals(tipo, "Frango"))
            new PizzaFrango(tamanho, pedaco);

        if(Objects.equals(tipo, "Calabresa"))
            new PizzaCalabresa(tamanho, pedaco);

        return pizza;
    }
}
