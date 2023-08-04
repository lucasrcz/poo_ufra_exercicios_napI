package Exercicios;

import Classes.Ponto;

public class main_exercicio5 {
    public static void main(String[] args) {
        Ponto pontoA = new Ponto(10, 10);
        System.out.println(pontoA.distancia(20, 20));
        Ponto pontoB = new Ponto(20, 20);
        System.out.println(pontoA.distancia(pontoB));
    }
}
