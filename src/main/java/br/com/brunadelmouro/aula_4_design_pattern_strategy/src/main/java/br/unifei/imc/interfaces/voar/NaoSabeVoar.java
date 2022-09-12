package br.unifei.imc.interfaces.voar;

public class NaoSabeVoar implements Voar{
    @Override
    public void voar() {
        System.out.println("Não sei voar!");
    }
}
