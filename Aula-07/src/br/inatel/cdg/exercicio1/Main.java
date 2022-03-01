package br.inatel.cdg.exercicio1;

public class Main{

    public static void main(String args[]){
        Cliente cliente1 = new Cliente("Jaum", 123456);

        Cliente cliente2 = new Cliente("Pablito",123456789);

        Cliente[] clientes = new Cliente[]{cliente1,cliente2};

        Conta conta = new Conta(1234,500.00f,clientes);
     
        System.out.println(conta.getSaldo());

        conta.deposita(700);

        System.out.println(conta.getSaldo());

        conta.sacar(300);

        System.out.println(conta.getSaldo());

        conta.sacar(1200);

        System.out.println(conta.getSaldo());
    }

}