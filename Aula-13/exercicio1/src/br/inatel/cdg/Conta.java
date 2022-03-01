package br.inatel.cdg;

public class Conta {
	
	private float saldo;
	private float limite;
	private Cliente[] clientes;
	
	
	public Conta(float saldo, float limite) {
		this.saldo = saldo;
		this.limite = limite;
		this.clientes = new Cliente[4];
	}
	
	public void addCliente(Cliente cliente) {
		for (int i = 0; i < clientes.length; i++) {
			if(clientes[i] == null) {
				clientes[i] = cliente;
				break;
			}
		}
	}
	
	public void mostraInfo() {
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
		
		
		for (Cliente cliente : clientes) {
			try {
				System.out.println("Nome do cliente: " + cliente.getNome());
				System.out.println("CPF do cliente: " + cliente.getCpf());
			} catch (NullPointerException e) {
				System.out.println("Nao existe cliente nessa posicao");
			}
			
		
		}
	}
	
	
	

}
