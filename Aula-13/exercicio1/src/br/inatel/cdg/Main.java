package br.inatel.cdg;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Tio", 4321);
		Cliente cliente2 = new Cliente("Tia", 1234);
		Cliente cliente3 = null;
		
		Conta conta = new Conta(1500, 500);

		conta.addCliente(cliente1);
		conta.addCliente(cliente2);
		conta.addCliente(cliente3);
//		conta.addCliente(null);
		
		conta.mostraInfo();
		
		
		System.out.println("Fim da Main");
		
	}

}
