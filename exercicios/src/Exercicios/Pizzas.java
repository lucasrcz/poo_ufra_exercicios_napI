package Exercicios;

import Classes.Pizza;

public class Pizzas {
    public static void main(String[] args) throws Exception {
        Pizza pizza1 = new Pizza("Peperoni", "Grande");
        System.out.println("Sabor da pizza:" + pizza1.getSabor());
        System.out.println("Tamanho da pizza: " + pizza1.getTamanho());
    }
}

