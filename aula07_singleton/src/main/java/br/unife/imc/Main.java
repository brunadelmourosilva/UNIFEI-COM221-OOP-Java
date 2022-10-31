package br.unife.imc;

public class Main {
    public static void main(String[] args) {

        /* processo de desacoplamento - encapsulamento da instância do novo objeto */
        var n1 = Nave.getInstance();
        var n2 = Nave.getInstance();
        var n3 = Nave.getInstance();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}