import java.util.Scanner;

public class Exercicio2{

    public static void main(String[] args) {
        
        //Criando um objeto do tipo Scanner, para ler do teclado
        Scanner entrada = new Scanner(System.in);

        //Variaveis que irão salvar o numero de zumbis mortos nas três partidas
        int partida1, partida2, partida3;

        System.out.print("Digite o número de zumbis mortos na primeira partida: ");
        partida1 = entrada.nextInt();
        System.out.print("Digite o número de zumbis mortos na segunda partida: ");
        partida2 = entrada.nextInt();
        System.out.print("Digite o número de zumbis mortos na terceira partida: ");
        partida3 = entrada.nextInt();

        //total de zumbis mortos
        int total = partida1 + partida2 + partida3;

        //media de zumbis mortos
        int media = total/3;

        System.out.println("Total de zumbis mortos: " + total);
        System.out.println("Media de zumbis mortos: " + media);

        //Para fechar o Scanner, após seu uso
        entrada.close();

    }
}