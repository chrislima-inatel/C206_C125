package br.inatel.cdg;

public class Main{

    public static void main(String args[]){
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Jaum");
        cliente1.setCpf(123456);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Pablito");
        cliente2.setCpf(123456789);

        Cliente[] clientes = new Cliente[2];
        clientes[0] = cliente1;
        clientes[1] = cliente2;

        Conta conta = new Conta();
        conta.setClientes(clientes);
        conta.setLimite(500);
        conta.setNumero(1234);

        System.out.println(conta.getSaldo());

        conta.deposita(700);

        System.out.println(conta.getSaldo());

        conta.sacar(300);

        System.out.println(conta.getSaldo());

        conta.sacar(800);
    }

}