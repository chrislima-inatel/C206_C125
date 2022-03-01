package br.inatel.cdg.exercicio1;

public class Cliente{

    private String nome;
    private long cpf;

    //Construtor com parâmetros
    public Cliente(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //Construtor Vazio
    public Cliente(){}


    //Getters e Setters
    public long getCpf(){
        return this.cpf;
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setCpf(long cpf){
        this.cpf = cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}