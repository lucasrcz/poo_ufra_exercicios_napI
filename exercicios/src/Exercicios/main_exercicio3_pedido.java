package Exercicios;

import Classes.Pedido;
import Classes.Produto;

public class main_exercicio3_pedido {
    public static void main(String[] args) {
        System.out.println("Pedido:");
        Pedido pedido = new Pedido(10, 5);
        System.out.println("Número de itens:" + pedido.getNumeroDeItens());
        System.out.println("Valor total:" + pedido.getValorTotal());
        pedido.pagar();
        pedido.cancelar();
    }
}
