package Exercicios;

import Classes.Pedido;
import Classes.Produto;

public class Pedidos {
    public static void main(String[] args) {
        System.out.println("Pedido:");
        Pedido pedido = new Pedido(0, 0);
        System.out.println("Número de itens:" + pedido.getNumeroDeItens());
        System.out.println("Valor total:" + pedido.getValorTotal());
        Produto escovaDeDentes = new Produto("Escova de Dentes", 5.90);
        System.out.println("Adicionando produto...");
        System.out.println("Produto:" + escovaDeDentes.getNome());
        System.out.println("Valor:" + escovaDeDentes.getValor());
        pedido.adicionarItem(escovaDeDentes);
        pedido.pagar();
        pedido.cancelar();
    }
}
