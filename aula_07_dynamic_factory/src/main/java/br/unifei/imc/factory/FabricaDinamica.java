package br.unifei.imc.factory;

import br.unifei.imc.asteroide.Asteroide;
import br.unifei.imc.enums.TipoAst;

public abstract class FabricaDinamica {

    protected abstract Asteroide criaAsteroide(TipoAst tipoAsteroide);

    public final Asteroide buscaAsteroide(TipoAst tipoAsteroide) {
        Asteroide ast = null;

        ast = criaAsteroide(tipoAsteroide);

        return ast;
    }
}
