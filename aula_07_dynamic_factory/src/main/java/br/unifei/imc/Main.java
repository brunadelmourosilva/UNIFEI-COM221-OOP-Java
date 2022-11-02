package br.unifei.imc;

import br.unifei.imc.enums.TipoAst;
import br.unifei.imc.factory.FabricaCenarioFacil;
import br.unifei.imc.factory.FabricaDinamica;

public class Main {
    public static void main(String[] args) {

        FabricaDinamica fabrica = new FabricaCenarioFacil();

        var asteroideFogo = fabrica.buscaAsteroide(TipoAst.AST_FOGO);
        System.out.println(asteroideFogo.getClass().getName());
        System.out.println(asteroideFogo.getDificuldade());
    }
}