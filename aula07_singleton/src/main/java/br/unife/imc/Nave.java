package br.unife.imc;

public class Nave {

    private static Nave instance = null;

    /**
     * impede não sejam criadas novas instâncias fora da classe
     **/
    private Nave() {
    }

    public static Nave getInstance() {
        if(instance == null) {
            instance = new Nave();
        }

        return instance;
    }
}
