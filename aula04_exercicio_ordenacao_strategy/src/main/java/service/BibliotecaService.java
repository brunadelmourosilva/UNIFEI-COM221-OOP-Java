package service;

import strategy.Ordernacao;

public class BibliotecaService {

    //composição
    private Ordernacao ordernacao;

    public BibliotecaService() {
    }

    public void apresentarNotasOrdenadas(double[] notas){
        ordernacao.ordernar(notas);

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }

    public void setOrdernacao(final Ordernacao ordernacao) {
        this.ordernacao = ordernacao;
    }
}
