package br.unifei.imc.reflection;


public class CriadorInstancia {

    public static Object criaInstancia(Class<?> clazz) {
        Object instance = null;

        try {
            instance = clazz.getConstructor().newInstance(); //create a new instance by constructor
        } catch (Exception e) {
            e.printStackTrace();
        }

        return instance;
    }

    public static Object criaInstancia(Class<?> clazz, Object[] parametros) {
        Object instance = null;

        //building an array of types
        var paramTypes = new Class[parametros.length];

        try {
            for (int i = 0; i < parametros.length; i++) {
                paramTypes[i] = CriadorInstancia.convertToPrimitiveType(parametros[i]);
            }

            instance = clazz.getConstructor(paramTypes).newInstance(parametros);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return instance;
    }

    private static Class<?> convertToPrimitiveType(Object object) {
        if(object.getClass() == Integer.class)
            return int.class;
        else if(object.getClass() == Double.class)
            return double.class;
        else
            return object.getClass();
    }
}
