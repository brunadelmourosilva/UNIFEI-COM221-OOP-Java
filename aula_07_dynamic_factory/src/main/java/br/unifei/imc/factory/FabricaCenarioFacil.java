package br.unifei.imc.factory;

import br.unifei.imc.asteroide.Asteroide;
import br.unifei.imc.enums.TipoAst;
import br.unifei.imc.utils.PropUtils;

public class FabricaCenarioFacil extends FabricaDinamica {


    @Override
    protected Asteroide criaAsteroide(TipoAst tipoAsteroide) {
        Asteroide ast = null;

        String nomeClasse = PropUtils.buscaNomeClasse(tipoAsteroide);

        /* Using reflection - represent the class description */
        try {
            var clazz = Class.forName(nomeClasse);

            /* Getting the constructor */
            ast = (Asteroide) clazz.getConstructor(int.class).newInstance(2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ast;
    }
}
