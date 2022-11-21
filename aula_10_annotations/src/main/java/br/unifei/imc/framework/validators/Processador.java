package br.unifei.imc.framework.validators;

import br.unifei.imc.framework.annotations.Ignorar;
import br.unifei.imc.framework.annotations.Nome;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Processador {

    public static Map<String, Object> gerarMapa(Object obj) {
        Map<String, Object> mapa = new HashMap<>();

        var clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Ignorar.class)) {
                continue;
            }

            if (field.isAnnotationPresent(Nome.class)) {
                var nome = field.getAnnotation(Nome.class);
                var nomeCampo = nome.nome();
                Object valor = null;

                try {
                    field.setAccessible(true);
                    valor = field.get(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                mapa.put(nomeCampo, valor);
            } else {
                var nomeCampo = field.getName();
                Object valor = null;
                try {
                    field.setAccessible(true);
                    valor = field.get(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                mapa.put(nomeCampo, valor);
            }
        }

        return mapa;
    }
}
