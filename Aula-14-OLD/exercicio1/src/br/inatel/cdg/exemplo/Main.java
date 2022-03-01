package br.inatel.cdg.exemplo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

	public static void main(String[] args) {
		String arquivo = "jogos.txt";
		try {
			InputStream input = new FileInputStream(arquivo);
			Reader inputSr = new InputStreamReader(input);
			
			BufferedReader leitor = new BufferedReader(inputSr);
			
			String texto = leitor.readLine();
			
			while(texto != null) {
				System.out.println(texto);
				texto = leitor.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo " + arquivo + "não encontrado");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
