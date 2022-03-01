package exemplo;

public class Conta {
	
	//Membros da classe
	int numero;
	float saldo;
	float limite;
	Cliente titular;
	
	//Metodo para depositar
	void deposita(float quantia) {
		saldo += quantia;
	}
	
	//Metodo para sacar
	void saca(float quantia) {
		float novoSaldo = saldo - quantia;
		saldo = novoSaldo;
	}

	//Metodo para sacar dinheiro
	void transferir(Conta contaDestino, float quantia) {
		saldo -= quantia;
		contaDestino.saldo += quantia;
	}
	
}
