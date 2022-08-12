package exemplo;

public class Main {


	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.nomeDoDono = "Joaquina";
		c1.saldo = 1000;
		c1.numero = 1234;
		c1.saldo = 2000;
		
		
		Conta c2 = new Conta();
		c2.nomeDoDono = "Roberval";
		c2.saldo = 1000;
		c2.numero = 4321;
		c2.saldo = 2000;
		
		
		
		System.out.println("O dono da classe eh: " + c1.nomeDoDono + " e o saldo eh: " + c1.saldo);

		//Depositando R$ 100
		c1.deposita(100);
		System.out.println(c1.saldo);
		
		
		//Sacando R4 50
		c1.saca(50);
		System.out.println(c1.saldo);
		
		//Transferindo dinheiro para C2
		c1.transferir(c2, 100);
		
		System.out.println("O saldo de C1 eh: " + c1.saldo);
		System.out.println("O saldo de C2 eh: " + c2.saldo);
		
		
		
	}
	
}
