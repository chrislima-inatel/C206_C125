package br.inatel.cdg;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Capiroto", 4321);
		Cliente cliente2 = new Cliente("Capirotin", 1234);
		
		Conta conta = new Conta(1500, 500);
		
		conta.addCliente(cliente1);
		conta.addCliente(cliente2);
		
		conta.mostraInfo();
		
		
		System.out.println("Fim da Main");
		
	}

}
