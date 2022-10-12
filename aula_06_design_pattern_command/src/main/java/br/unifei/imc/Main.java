package br.unifei.imc;

import br.unifei.imc.comando.AbrirGaragem;
import br.unifei.imc.comando.AcendeLampada;
import br.unifei.imc.comando.ApagaLampada;
import br.unifei.imc.comando.FecharGaragem;
import br.unifei.imc.controle.Controle;
import br.unifei.imc.dispositivos.Garagem;
import br.unifei.imc.dispositivos.Lampada;

public class Main {
    public static void main(String[] args) {

        Controle c = new Controle(5);

        AbrirGaragem ag = new AbrirGaragem(new Garagem());
        FecharGaragem fg = new FecharGaragem(new Garagem());
        AcendeLampada al = new AcendeLampada(new Lampada());
        ApagaLampada apl = new ApagaLampada(new Lampada());
        AcendeLampada al1 = new AcendeLampada(new Lampada("Quarto"));


        c.setComando(1, ag, fg);
        c.apertarBtnLiga(1);
        c.apertarBtnDesliga(1);

        c.setComando(2, al, apl);
        c.apertarBtnLiga(2);
        c.apertarBtnDesliga(2);

        c.setComando(3, al1, apl);
        c.apertarBtnLiga(3);

    }
}