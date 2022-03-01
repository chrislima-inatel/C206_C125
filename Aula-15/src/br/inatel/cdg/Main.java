package br.inatel.cdg;

public class Main {

	public static void main(String[] args) {

		Thread th1 = new Thread(new Contador1());
		th1.start();
		
		Thread th2 = new Thread(new Contador2());
		th2.start();
		
		Thread th3 = new Thread(new Contador3());
		th3.start();
		
	}

}
