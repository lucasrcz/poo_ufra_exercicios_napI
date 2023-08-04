package Exercicios;

import Classes.Pedido;
import Classes.Produto;

public class main_exericio_4 {
    public static void main(String[] args) {
         System.out.println("Pedido:");
        Pedido pedido = new Pedido(0, 0);
        System.out.println("Número de itens:" + pedido.getNumeroDeItens());
        System.out.println("Valor total:" + pedido.getValorTotal());
        Produto escovaDeDentes = new Produto("Escova de Dentes", 5.90);
        pedido.adicionarItem(escovaDeDentes);
        System.out.println("Produto:" + escovaDeDentes.getNome());
        System.out.println("Valor:" + escovaDeDentes.getValor());
        pedido.pagar();
        pedido.cancelar();
    }   
}
