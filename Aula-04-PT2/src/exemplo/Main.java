package exemplo;

public class Main {


	public static void main(String[] args) {
		
		Conta conta = new Conta();
		Cliente cliente = new Cliente();
		
		cliente.nome = "Jaum";
		cliente.cpf = "123.123.123";
		
		conta.titular = cliente;
		
		conta.saldo = 1000;
		conta.numero = 1234;
		conta.saldo = 2000;
		
		System.out.println("Nome do cliente: " + conta.titular.nome);
		System.out.println("CPF do cliente: " + conta.titular.cpf);
		
		//Mesma saída
		System.out.println("Nome do cliente " + cliente.nome);
		
	}
	
}
