package br.unifei.imc.gerador;

import br.unifei.imc.model.Pessoa;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorJSON implements GeradorArquivo {
    @Override
    public void gerarArquivo(List<Pessoa> pessoas) {
        FileWriter arquivo;
        try {
            arquivo = new FileWriter("pessoas.json");

            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            gson.toJson(pessoas, arquivo);

            arquivo.close();

            System.out.println("Arquivo JSON criado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
