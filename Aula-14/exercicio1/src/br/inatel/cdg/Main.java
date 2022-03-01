package br.inatel.cdg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Path arquivo = Paths.get("jogos.txt");
		
		try {
			List<String> conteudo = Files.readAllLines(arquivo);
			Map<String,String> jogos = new HashMap<>();
			
			conteudo.forEach((linha) -> {
				String[] linhaQuebrada = linha.split(";");
				jogos.put(linhaQuebrada[0],linhaQuebrada[1].strip());
			});
			
			jogos.forEach((jogo, empresa) -> {
				System.out.println("Jogo: " + jogo);
				System.out.println("Empresa: " + empresa);
				System.out.println("");
			});
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}