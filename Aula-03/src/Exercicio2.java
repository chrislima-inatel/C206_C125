import java.util.Scanner;

public class Exercicio2{

    public static void main(String[] args) {
        
        //Criando um objeto do tipo Scanner, para ler do teclado
        Scanner entrada = new Scanner(System.in);

        //Variaveis que irão salvar o numero de lanches consumidos
        int lanche1, lanche2, lanche3;

        System.out.print("Digite o número de lanches consumidos na primeira hora: ");
        lanche1 = entrada.nextInt();
        System.out.print("Digite o número de lanches consumidos na segunda hora: ");
        lanche2 = entrada.nextInt();
        System.out.print("Digite o número de lanches consumidos na terceira hora: ");
        lanche3 = entrada.nextInt();

        //total de lanches
        int total = lanche1 + lanche2 + lanche3;

        //media de lanches
        int media = total/3;

        System.out.println("Total de lanches consumidos: " + total);
        System.out.println("Media de lanches consumidos: " + media);

        //Para fechar o Scanner, após seu uso
        entrada.close();

    }
}