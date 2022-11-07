package br.unifei.imc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Puzzle {

   private String nome;
   private double qtdPecas;
   private double largura;
   private double altura;
}
