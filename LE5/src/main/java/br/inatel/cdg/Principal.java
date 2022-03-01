package br.inatel.cdg;

import java.nio.file.Path;
import java.nio.file.Paths;
import br.inatel.cdg.util.CSVUtils;

public class Principal {

    public static void main(String[] args) {

        Path arquivo = Paths.get("funcionarios.csv");

        CSVUtils.gerarCSVFuncSemFilhos(arquivo);

    }

}