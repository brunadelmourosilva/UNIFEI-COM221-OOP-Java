package br.unifei.imc.utils;

import br.unifei.imc.enums.TipoAst;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropUtils {

    public static String buscaNomeClasse(TipoAst tipoAsteroide) {
        var properties = new Properties();

        try {
            properties.load(Files.newInputStream(
                    Paths.get("asteroides.properties")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return properties.getProperty(tipoAsteroide.name());
    }
}
