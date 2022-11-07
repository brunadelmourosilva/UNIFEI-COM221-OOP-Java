package br.unifei.imc.gerador;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class GeradorPropriedades {

    public static Map<String, Object> geraPropriedades(Object o) throws InvocationTargetException, IllegalAccessException {
        Map<String, Object> propriedades = new HashMap<>();

        var clazz = o.getClass();

        for (Method method : clazz.getMethods()) {
            if(GeradorPropriedades.isGetter(method)) {
                var nomeCampo = getNomeCampo(method);
                Object valor = method.invoke(o);

                propriedades.put(nomeCampo, valor);
            }
        }

        return propriedades;
    }

    private static boolean isGetter(Method method) {
        return
        method.getName().startsWith("get") &&
        method.getName() != "getClass" &&
        method.getReturnType() != void.class &&
        method.getParameterCount() == 0;
    }

    private static String getNomeCampo(Method method) {
        String nomeMetodo, nomeCampo = "";

        nomeMetodo = method.getName();

        nomeCampo = String.valueOf(nomeMetodo.charAt(3)).toLowerCase();
        nomeCampo += nomeMetodo.substring(4);

        return nomeCampo;
    }
}
