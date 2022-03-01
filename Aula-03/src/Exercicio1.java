public class Exercicio1{

    public static void main(String[] args) {
        
        //numero de zumbis mortos nas partidas
        int partida1 = 130, partida2 = 240, partida3 = 320;

        //total de zumbis mortos
        int total = partida1 + partida2 + partida3;

        //media de zumbis mortos
        int media = total/3;

        System.out.println("Total de zumbis mortos: " + total);
        System.out.println("Media de zumbis mortos: " + media);
        
    }
}