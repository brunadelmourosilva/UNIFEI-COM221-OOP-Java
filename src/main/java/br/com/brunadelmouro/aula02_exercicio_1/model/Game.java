package br.com.brunadelmouro.aula04_exercicio_openCSV.model;

import lombok.Data;

@Data
public class Game {

    private Integer rank;
    private String name;
    private String platform;
    private Integer year;
    private String global_sales;
    private String publisher;
}
