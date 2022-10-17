package org.example;

import org.example.observer.AssinanteRevista;
import org.example.observer.Revista;

public class Main {
    public static void main(String[] args) {

        AssinanteRevista assinanteRevista1 = new AssinanteRevista();
        assinanteRevista1.setNome("Bruna");
        AssinanteRevista assinanteRevista2 = new AssinanteRevista();
        assinanteRevista2.setNome("Alex");
        AssinanteRevista assinanteRevista3 = new AssinanteRevista();
        assinanteRevista3.setNome("Spike");

        Revista revista = new Revista();

        revista.adicionaObservador(assinanteRevista1);
        revista.adicionaObservador(assinanteRevista2);
        revista.adicionaObservador(assinanteRevista3);

        revista.setVersaoRevista("versão 1");

        revista.removeObservador(assinanteRevista2);

        revista.setVersaoRevista("versão especial de natal");
    }
}