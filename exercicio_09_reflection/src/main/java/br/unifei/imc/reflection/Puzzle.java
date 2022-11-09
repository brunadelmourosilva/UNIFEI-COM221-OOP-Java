package br.unifei.imc.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Puzzle {

    private String nome;
    private int qtdPecas;
    private double largura;
    private double altura;
}
