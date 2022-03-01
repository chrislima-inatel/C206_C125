package br.inatel.cdg.exercicio2;

public class Zumbi {

    private double vida;
    private String tipo;

    public Zumbi(double vida, String tipo) {
        this.setVida(vida);
        this.setTipo(tipo);
    }

    public void atacar(){
        System.out.println("Zumbi Atacando!");
    }

    //Getter e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }


}