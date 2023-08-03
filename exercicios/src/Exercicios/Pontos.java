package Exercicios;

import Classes.Ponto;

public class Pontos {
    public static void main(String[] args) {
        Ponto pontoA = new Ponto(10, 10);
        System.out.println(pontoA.distancia(20, 20));
        Ponto pontoB = new Ponto(30, 25);
        System.out.println(pontoA.distancia(pontoB));
    }
}
