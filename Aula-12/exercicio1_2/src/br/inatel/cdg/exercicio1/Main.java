package br.inatel.cdg.exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		List<Double> listaDouble = new ArrayList<Double>();
		
		for (int i = 0; i < 5; i++) {
			listaDouble.add(new Random()
					.nextDouble()*100);
		}
		
		System.out.println("Antes da Ordenação");
		
		for (Double double1 : listaDouble) {
			System.out.println(double1);
		}
		
		System.out.println("Depois da Ordenação");
		
		Collections.sort(listaDouble, Collections.reverseOrder());
		
		for (Double double1 : listaDouble) {
			System.out.println(double1);
		}
		
	}

}
