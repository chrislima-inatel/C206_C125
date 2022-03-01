package exercicio5;

public class Main{

    public static void main(String args[]){
        Ashen ashen1 = new Ashen();
        Ashen ashen2 = new Ashen();

        ashen1.vida = 90;
        ashen2.vida = 85;

        Arma arma1 = new Arma();
        Arma arma2 = new Arma();

        arma1.descricao = "Artorias Greatsword";
        arma2.descricao = "Twinblades";

        arma1.resistencia = 100;
        arma2.resistencia = 90;

        ashen1.arma = arma1;
        ashen2.arma = arma2;

        System.out.println("Vida do Ashen1: " + ashen1.vida);

        ashen1.tomaDano();
        
        System.out.println("Vida do Ashen1 apos tomar dano: " + ashen1.vida);

        System.out.println("Info da Arma do Ashen2");
        ashen2.arma.mostrarInfo();
        ashen2.usarArma();
        System.out.println("Usou a Arma");
        System.out.println("Nova Info");
        ashen2.arma.mostrarInfo();
    }
}