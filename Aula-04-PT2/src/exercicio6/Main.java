package exercicio6;


public class Main{
    public static void main(String args[]){
        
        //Criando Karts
        //Lembrando que o Motor é criado junto
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.nome = "Kart1";
        kart2.nome = "Kart2";

        //Colocando valores para o motor do Kart1
        kart1.motor.cilindradas = "150";
        kart1.motor.velocidadeMaxima = 95.20f;

        //Colocando valores para o motor do Kart2
        kart2.motor.cilindradas = "50";
        kart2.motor.velocidadeMaxima = 76.10f;

        //Criando dois pilotos
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        //Atribuindo valores para os pilotos
        piloto1.nome = "Piloto1";
        piloto2.nome = "Piloto2";

        //Associando os pilotos aos Karts
        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        //Executando acoes do piloto
        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        //Executando acoes do Kart1
        kart1.fazerDrift();
        kart1.motor.mostraInfo();

        //Executando acoes do Kart2
        kart2.soltarTurbo();
        kart2.motor.mostraInfo();
        

    }
}