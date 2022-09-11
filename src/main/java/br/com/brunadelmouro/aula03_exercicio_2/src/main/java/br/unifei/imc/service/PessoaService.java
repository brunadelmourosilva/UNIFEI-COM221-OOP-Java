package br.unifei.imc.service;

import br.unifei.imc.exceptions.OpcaoErradaException;
import br.unifei.imc.gerador.GeradorCSV;
import br.unifei.imc.gerador.GeradorJSON;
import br.unifei.imc.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaService {

    private List<Pessoa> pessoas;

    public PessoaService() {
        this.pessoas = new ArrayList<>();
        gerarMapaPessoa();
    }

    private void gerarMapaPessoa() {
        pessoas.add(new Pessoa(1, "Guts", 39));
        pessoas.add(new Pessoa(2, "Casca", 30));
        pessoas.add(new Pessoa(3, "Andreas", 60));
    }

    public void gerarArquivo(final OpcaoArquivo csv) {
        if (csv == null) throw new OpcaoErradaException("Esta opção não existe.");

        if (csv.equals(OpcaoArquivo.CSV)) {
            var geradorCSV = new GeradorCSV();
            geradorCSV.gerarArquivo(this.pessoas);
        } else {
            var geradorJson = new GeradorJSON();
            geradorJson.gerarArquivo(this.pessoas);
        }
    }
}
