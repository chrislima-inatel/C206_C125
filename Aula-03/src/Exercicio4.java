import java.util.Scanner;

public class Exercicio4{

    public static void main(String[] args) {
        
        //Criando um objeto do tipo Scanner, para ler do teclado
        Scanner entrada = new Scanner(System.in);

        int numAlunosMatriculado;

        System.out.print("Digite o número de alunos matriculados em C125: ");
        numAlunosMatriculado = entrada.nextInt();
       
        switch (numAlunosMatriculado) {
            case 10:
            case 20:
                System.out.println("A aula será ministrada na sala I-16");
            break;
            case 30:
                System.out.println("A aula será ministrada na sala I-22");
            break;
            default:
                System.out.println("Número incorreto de alunos matriculados");
                break;
        }

        //Para fechar o Scanner, após seu uso
        entrada.close();

    }
}