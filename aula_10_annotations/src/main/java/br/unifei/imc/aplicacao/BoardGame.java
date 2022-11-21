package br.unifei.imc.aplicacao;


import br.unifei.imc.framework.annotations.Ignorar;
import br.unifei.imc.framework.annotations.Nome;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardGame {

    @Nome(nome = "Quantidade de jogadores")
    private int qtdPlayers;

    @Ignorar()
    private double preco;

    @Nome(nome = "Nome do jogo")
    private String nome;
}
