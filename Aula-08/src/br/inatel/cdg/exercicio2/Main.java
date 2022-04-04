package br.inatel.cdg.exercicio2;

import java.util.Random;
import java.util.Scanner;

public class Main{


    public static void main(String args[]){

        boolean campoMinado[][] = new boolean[2][2];

        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);


        int posicaoMinaX = rand.nextInt(2);
        int posicaoMinaY = rand.nextInt(2);
        System.out.println("Bomba: "+posicaoMinaX + " - " +posicaoMinaY);

        campoMinado[posicaoMinaX][posicaoMinaY] = true;

        int posicaoXJogador, posicaoYJogador;

        System.out.println("Bem vindo ao Campo Minado!");

        //solucao utilizando for
        for (int i = 0; i < campoMinado.length*2; i++){
            System.out.print("Digite uma posicao X: ");
            posicaoXJogador = entrada.nextInt();
            System.out.print("Digite uma posicao Y: ");
            posicaoYJogador = entrada.nextInt();
            if(campoMinado[posicaoXJogador][posicaoYJogador]){
                System.out.println("EXPLODIU!");
            }else{
                System.out.println("SAFE!");
            }
        }

        //Solucao utilizando do - while
//        int contador = 0;
//        do {
//            System.out.print("Digite uma posicao X: ");
//            posicaoXJogador = entrada.nextInt();
//
//            System.out.print("Digite uma posicao Y: ");
//            posicaoYJogador = entrada.nextInt();
//
//            if(campoMinado[posicaoXJogador][posicaoYJogador]){
//                System.out.println("Opa acertou a mina");
//                contador = 0;
//            }else{
//                System.out.println("Boa! Sem mina");
//                contador++;
//            }
//
//
//        } while (contador < 3);


        System.out.println("Jogo Encerrado");
        entrada.close();

    }


}