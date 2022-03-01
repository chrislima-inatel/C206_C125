package exercicio5;

public class Ashen{

    String nome;
    int vida;
    Arma arma;

    void usarArma(){
        arma.resistencia -= 2;
    }

    void tomaDano(){
        vida -= 5;
    }

}