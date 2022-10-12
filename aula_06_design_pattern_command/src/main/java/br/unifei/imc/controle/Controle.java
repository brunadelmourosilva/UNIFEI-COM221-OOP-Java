package br.unifei.imc.controle;

import br.unifei.imc.comando.Comando;
import br.unifei.imc.comando.NullComand;

import java.util.ArrayList;
import java.util.List;

public class Controle {

    //private Comando comando;
    private List<Comando> comandosLigar;
    private List<Comando> comandosDesligar;


    public Controle(int qtdBtn){
        comandosLigar = new ArrayList<>();
        comandosDesligar = new ArrayList<>();
        for(int i = 0; i < qtdBtn; i++)
            comandosLigar.add(new NullComand());
            comandosDesligar.add(new NullComand());
    }


    public void apertarBtnLiga(int indice) {
        comandosLigar.get(indice).executar();
    }

    public void apertarBtnDesliga(int indice) {
        comandosDesligar.get(indice).executar();
    }

    public void setComando(int indice, Comando comandoLigar, Comando comandoDesligar){
        comandosLigar.add(indice, comandoLigar);
        comandosDesligar.add(indice, comandoDesligar);
    }

}
