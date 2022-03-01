import java.util.Scanner;

public class Exercicio3{

    public static void main(String[] args) {
        
        //Criando um objeto do tipo Scanner, para ler do teclado
        Scanner entrada = new Scanner(System.in);

        int np3, npa;

        System.out.print("Digite a nota NPA: ");
        npa = entrada.nextInt();
       
        if(npa >= 60){
            System.out.println("Parabéns! Você está aprovado");
        }else{
            System.out.println("Ainda há chance! Rumo a NP3");

            System.out.print("Digite a nota NP3: ");
            np3 = entrada.nextInt();

            if((np3 + npa)/2 >= 50){
                System.out.println("Aeeeee. Aprovou!");
            }else{
                System.out.println("Não deu! Nos vemos no próximo semestre!");
            }

        }
        //Para fechar o Scanner, após seu uso
        entrada.close();

    }
}