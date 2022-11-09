package br.unifei.imc.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardGame {

    private String nome;
    private int qtdJogadores;
    private double preco;
}
