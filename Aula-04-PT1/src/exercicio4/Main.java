package exercicio4;

public class Main{

    public static void main(String[] args){

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 200;

        System.out.println("Vida do zumbi z1: " + z1.vida);
        System.out.println("Vida do zumbi z2: " + z2.vida);

        if(z1.transfereVida(z2, 50)){
            System.out.println("Fazendo z1 transferir 50 para z2");
            System.out.println("Vida do zumbi z1: " + z1.vida);
            System.out.println("Vida do zumbi z2: " + z2.vida);
        }
            

        if(z1.transfereVida(z2, 150)){
            System.out.println("Fazendo z1 transferir 150 para z2");
            System.out.println("Vida do zumbi z1: " + z1.vida);
            System.out.println("Vida do zumbi z2: " + z2.vida);
        }else{
            System.out.println("A vida não foi alterada!!");
        }
            
          
    }


}