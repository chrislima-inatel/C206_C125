package br.inatel.cdg.exercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String frase = "Bora montar um Quebra-Quebra!";
		int deslocamento = 5;
		String nomeArquivo = "textoCriptografado.txt";
		
		//Parte para escrever o arquivo!
		StringBuilder textoCriptografado = new StringBuilder();
		
		for (int i = 0; i < frase.length(); i++) {
			textoCriptografado.append((char)(frase.charAt(i) + deslocamento));
		}
		
		try {
			PrintStream ps = new PrintStream(nomeArquivo);
			ps.append(textoCriptografado);
			ps.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(textoCriptografado.toString());
		
		//Leitura do arquivo
		StringBuilder textDescriptografado = new StringBuilder();
		String fraseSalvoArquivo = null;
		Scanner entrada = null;
		try {
			entrada = new Scanner(new File(nomeArquivo));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(entrada.hasNext()) {
			fraseSalvoArquivo = entrada.nextLine();
		}
		
		entrada.close();
		for (int i = 0; i < fraseSalvoArquivo.length(); i++) {
			textDescriptografado.
					append((char)(fraseSalvoArquivo.charAt(i) - deslocamento));
		}
		
		System.out.println(fraseSalvoArquivo);
		System.out.println(textDescriptografado.toString());
			
	}

}
