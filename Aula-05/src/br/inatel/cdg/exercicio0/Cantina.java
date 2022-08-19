package br.inatel.cdg.exercicio0;

public class Cantina {

    String nome;
    Salgado[] salgados = new Salgado[5];

    void addSalgados(Salgado novoSalgado){
        for(int i = 0; i < salgados.length; i++){//Varrendo o array de salgados
            if(salgados[i] == null){//Verifica se não existe salgado
                salgados[i] = novoSalgado;
                break; //Adiciona e sai do metodo
            }
        }
    }

    void mostraInfo(){
        System.out.println("A Cantina: " + this.nome + " possui os seguintes salgados:");
        for (Salgado salgado : salgados) {
            if(salgado != null)//Verifica se existe salgado antes de imprimir
                System.out.println(salgado.nome);
        }
    }
}
