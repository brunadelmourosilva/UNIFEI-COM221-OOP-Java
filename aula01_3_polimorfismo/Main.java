package br.com.brunadelmouro.aula03_3_polimorfismo;

import br.com.brunadelmouro.aula03_3_polimorfismo.pessoas.Cliente;
import br.com.brunadelmouro.aula03_3_polimorfismo.pessoas.Lavador;
import br.com.brunadelmouro.aula03_3_polimorfismo.veiculos.Caminhao;
import br.com.brunadelmouro.aula03_3_polimorfismo.veiculos.Carro;
import br.com.brunadelmouro.aula03_3_polimorfismo.veiculos.Moto;

public class Main {

    public static void main(String[] args) {

        //instances for objects
        Lavanderia lavanderia = new Lavanderia("Fast Clean", 500000.0);

        Lavador lavador = new Lavador("João", "10000000", 2000.0);

        Cliente cliente = new Cliente("Bruna", "3000000", 5000.0);

        Carro carro = new Carro("Jeep", "Vinho", "2020");
        Moto moto = new Moto("Honda", "Azul", "2012");
        Caminhao caminhao = new Caminhao("Wosk.", "Preto", "2020");

        /* ------------------------------------ */

        //calling the first action
        lavanderia.lavaVeiculo(carro, cliente, lavador);

        System.out.println("-------------------------------");

        //calling the first action
        lavanderia.lavaVeiculo(moto, cliente, lavador);

        System.out.println("-------------------------------");

        //calling the first action
        lavanderia.lavaVeiculo(caminhao, cliente, lavador);

        System.out.println("-------------------------------");
    }
}
