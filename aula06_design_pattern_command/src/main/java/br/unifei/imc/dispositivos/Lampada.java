package br.unifei.imc.dispositivos;

public class Lampada {

    private String comodo;

    public Lampada(){
        comodo = "Cozinha";
    }

    public Lampada(String comodo){
        this.comodo = comodo;
    }

    public void acender(){
        System.out.println("Lampada do(a) " + comodo + " acendendo!");
    }

    public void apagar(){
        System.out.println("Lampada do(a) " + comodo + " apagando!");
    }

}
