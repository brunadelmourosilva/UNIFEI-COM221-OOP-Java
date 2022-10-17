package org.example;

import org.example.observer.Boate;
import org.example.observer.Seguranca;

public class Main {
    public static void main(String[] args) {

        var pessoa1 = new Pessoa();
        pessoa1.setNome("Bruna");
        pessoa1.setIdade(20);

        var pessoa2 = new Pessoa();
        pessoa2.setNome("Alex");
        pessoa2.setIdade(17);

        var boate = new Boate();
        boate.adiciona(new Seguranca("Joana"));
        boate.adiciona(new Seguranca("João"));

        boate.setPessoas(pessoa1);
        boate.setPessoas(pessoa2);
    }
}