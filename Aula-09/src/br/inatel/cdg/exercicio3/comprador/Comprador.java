package br.inatel.cdg.exercicio3.comprador;

import br.inatel.cdg.exercicio3.brownies.Brownie;

public class Comprador {

    private String nome;
    private double saldo;


    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    //Esse método lida somente com a abstração Brownie. Posso comprar qualquer brownie que herde de Brownie.
    public void efetuarCompra(Brownie brownie){
        brownie.addCarrinhoDeCompras();
        brownie.calculaValorTotalCompra();
        System.out.println("Comprador comprou o brownie "+ brownie.getNome());
    }
}