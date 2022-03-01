package br.inatel.cdg.funcionario;

public class Funcionario {

    private int id;
    private double salario;
    private int numFilhos;

    public Funcionario(int id, int numFilhos, double salario) {
        this.id = id;
        this.salario = salario;
        this.numFilhos = numFilhos;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public int getNumFilhos() {
        return numFilhos;
    }

}