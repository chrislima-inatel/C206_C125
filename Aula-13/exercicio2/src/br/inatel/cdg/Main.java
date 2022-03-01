package br.inatel.cdg;

import br.inatel.cdg.exception.SaldoInsuficienteException;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Capiroto", 4321);
		Cliente cliente2 = new Cliente("Capirotin", 1234);
		
		Conta conta = new Conta(1500, 500);
		
		conta.addCliente(cliente1);
		conta.addCliente(cliente2);
		
		System.out.println("Mostra Info dos Clientes");
		System.out.println();
		conta.mostraInfo();
		System.out.println();
		System.out.println("Tenta Sacar 1000");
		try {
			conta.sacar(1000);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		conta.mostraInfo();
		System.out.println();
		
		System.out.println("Tenta Sacar 1000");
		
		try {
			conta.sacar(1000);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		conta.mostraInfo();
		System.out.println();
		
		System.out.println("Fim da Main");
		
	}

}
