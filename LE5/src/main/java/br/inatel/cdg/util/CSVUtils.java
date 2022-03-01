package br.inatel.cdg.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import br.inatel.cdg.funcionario.Funcionario;

public class CSVUtils {

    public static void gerarCSVFuncSemFilhos(Path arquivo) {

        List<Funcionario> func = leCsv(arquivo);

        gerarCsvNovo("func_filtrado.csv", func);
    }

    private static void gerarCsvNovo(String nomeArquivo,
                                     List<Funcionario> func) {

        String cabecalho = "ID,Filhos,Salario\n";

        Path arquivoFinal = Paths.get(nomeArquivo);

        try {
            Files.writeString(arquivoFinal, cabecalho);

            StringBuilder builder = new StringBuilder();

            func.stream().
                    filter((f) -> f.getNumFilhos()!=0).
                    forEach((f) -> {
                        builder.append(f.getId() + ",").
                                append(f.getNumFilhos() + ",").
                                append(f.getSalario()+ "\n");
                    });

            Files.writeString(arquivoFinal, builder.toString(),
                    StandardOpenOption.APPEND);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static List<Funcionario> leCsv(Path arquivo){

        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            List<String> linhas = Files.readAllLines(arquivo);
            linhas.remove(0);

            linhas.forEach((linha) -> {

                String[] linhaSplit = linha.split(",");

                Funcionario func = new Funcionario
                        (Integer.parseInt(linhaSplit[0]),
                                Integer.parseInt(linhaSplit[3]),
                                Double.parseDouble(linhaSplit[4]));
                funcionarios.add(func);

            });


        } catch (IOException e) {
            e.printStackTrace();
        }

        return funcionarios;

    }


}