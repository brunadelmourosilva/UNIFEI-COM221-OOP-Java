package br.unifei.imc.processador.observadores;

public class ContaPalavrasImpares implements Observador {

    private int numPalavras;

    @Override
    public int getNumPalavras() {
        return numPalavras;
    }

    @Override
    public void atualiza(String palavra) {
        if(palavra.length() % 2 == 1)
            numPalavras++;
    }
}
