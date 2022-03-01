package br.inatel.cdg.exercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String nomeArquivo = "jogos.txt";
		
		//Etapa de Escrita de Arquivo
		BufferedWriter writer = null;
		
		try {
			OutputStream out = new FileOutputStream(nomeArquivo);
			OutputStreamWriter outWriter = new OutputStreamWriter(out);
			writer = new BufferedWriter(outWriter);
			
			StringBuilder builder = new StringBuilder();
			
			builder.append("Dark Souls ; From Software\n");
			builder.append("Zombicide ; Galapagos\n");
			builder.append("Doom ; ID Software\n");
			builder.append("Azul ; Galapagos\n");
			builder.append("World of Warcraft ; Blizzard");
			
			
			writer.append(builder);
			
			writer.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//Etapa de leitura do arquivo!
		
		File arquivo = new File(nomeArquivo);
		Scanner entrada = null;
		List<String> nomeDosJogos = new ArrayList<String>();
		List<String> nomeDasEmpresas = new ArrayList<String>();
		
		try {
			entrada = new Scanner(arquivo);
			
			while(entrada.hasNext()) {
				String[] linhaSeparada = entrada.nextLine().split(" ; ");
				nomeDosJogos.add(linhaSeparada[0]);
				nomeDasEmpresas.add(linhaSeparada[1]);
			}
				
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			entrada.close();
		}
		
		for (int i = 0; i < nomeDosJogos.size(); i++) {
			System.out.println("Jogo: " + nomeDosJogos.get(i));
			System.out.println("Empresa: " + nomeDasEmpresas.get(i)) ;
		}
		
	}

}
