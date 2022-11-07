package br.unifei.imc;

import br.unifei.imc.gerador.GeradorPropriedades;
import br.unifei.imc.pojo.BoardGame;
import br.unifei.imc.pojo.Puzzle;
import lombok.extern.java.Log;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;


@Log
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

        var puzzle = new Puzzle("Jardim Vitoriano", 5000, 96, 58);
        var boardGame = new BoardGame("Board Game Dummy", 300, 10);

        var clazz = puzzle.getClass();

        Map<String, Object> mapaPuzzle = GeradorPropriedades.geraPropriedades(puzzle);
        Map<String, Object> mapaBoardGame = GeradorPropriedades.geraPropriedades(boardGame);

        mapaPuzzle.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println();
        mapaBoardGame.forEach((k, v) -> System.out.println(k + " : " + v));

//        for(Method method : clazz.getMethods()) {
//            System.out.println(method.getName());
//        }

//        System.out.println("------------------------");
//
//        for(Field field : clazz.getDeclaredFields()) {
//            field.setAccessible(true); //todos os atributos serão visíveis
//            var object = field.get(puzzle);
//
//            log.info(field.getName().concat(" : ") + object + "\n");
//        }
    }
}