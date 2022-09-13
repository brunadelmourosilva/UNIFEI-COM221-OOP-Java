package br.unifei.imc.models;

import java.util.ArrayList;
import java.util.List;

public class FabricaPatos {

    public static List<Pato> geraPatos() {
        var patos = new ArrayList<Pato>();

        patos.add(new Marreco());
        patos.add(new Ruiva());
        patos.add(new Borracha());

        return patos;
    }
}
