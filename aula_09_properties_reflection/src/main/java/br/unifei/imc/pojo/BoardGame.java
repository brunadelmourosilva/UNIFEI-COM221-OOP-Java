package br.unifei.imc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BoardGame {

    private String nome;
    private double preco;
    private int qtdJogadores;
}
