import java.util.Random;
import java.util.Scanner;

public class Exercicio5{

    public static void main(String[] args) {
        
        //Criando um objeto do tipo Scanner, para ler do teclado
        Scanner entrada = new Scanner(System.in);

        //Criando um objeto do tipo Random para gerar numeros aleatórios
        Random rand = new Random();
        
        int numGerado, numAdivinhado;

        //Irá gerar números aleatórios entre 1 e 10
        numGerado = rand.nextInt(10) + 1;

        do {
            System.out.print("Qual o número que estou pensando? ");
            numAdivinhado = entrada.nextInt();
            if(numAdivinhado != numGerado)
                System.out.println("Errrrouu");

        } while (numGerado != numAdivinhado);

        System.out.println("Parabéns. Você acertou meu número!");

        //Para fechar o Scanner, após seu uso
        entrada.close();

    }
}