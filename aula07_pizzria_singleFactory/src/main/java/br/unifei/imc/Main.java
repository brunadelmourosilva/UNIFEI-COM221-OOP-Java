package br.unifei.imc;

import br.unifei.imc.pizzaria.FabricaSingleFactory;
import br.unifei.imc.pizzaria.Pizzaria;

public class Main {
    public static void main(String[] args) {


        var factory = new FabricaSingleFactory();

        var pizzaria = new Pizzaria(factory);

        pizzaria.encomendarPizza("Frango", "Grande", 8);
        pizzaria.encomendarPizza("Calabresa", "Grande", 8);
    }
}