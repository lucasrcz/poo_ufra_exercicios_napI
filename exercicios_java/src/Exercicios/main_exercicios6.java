package Exercicios;

import Classes.Pessoa;

public class main_exercicios6 {
    public static void main(String[] args) {
        Pessoa lucas = new Pessoa("Lucas", "Sr.");
        Pessoa fernanda = new Pessoa("Fernanda", "Sra.");
        lucas.cumprimentar(fernanda, "bem vinda ao nosso nobre chalé do chá das 11 horas");
        fernanda.cumprimentar( "Obrigada!");
    }
}
