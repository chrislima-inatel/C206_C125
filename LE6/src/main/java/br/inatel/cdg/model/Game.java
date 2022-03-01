package br.inatel.cdg.model;

import lombok.Data;
@Data
public class Game {

    private int rank;
    private String name;
    private int year;
    private String platform;
    private String global_sales;
    private String publisher;

}