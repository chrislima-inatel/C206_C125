package br.inatel.cdg.aula_16_maven;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.inatel.cdg.aula_16_maven.inimigo.Inimigo;

public class Principal {

	public static void main(String[] args) {

		List<Inimigo> inimigos = new ArrayList<>();
		inimigos.add(new Inimigo("Black Knight", 200));
		inimigos.add(new Inimigo("SIlver Knight", 300));
		
		Gson gson = new GsonBuilder().
				setPrettyPrinting().create();
		
		String json = gson.toJson(inimigos);
		
		Path arquivo = Paths.get("jogos.json");
		try {
			Files.writeString(arquivo, json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
