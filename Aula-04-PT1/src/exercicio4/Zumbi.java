package exercicio4;

public class Zumbi{

    double vida;
    String nome;

    double mostraVida(){
        return this.vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia){
        if(this.vida > quantia){
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }else{
            System.out.println("Não posso transferir a quantidade: " 
                    + quantia + " pois minha vida é: " + this.vida);
            return false;
        }
        
    }

}