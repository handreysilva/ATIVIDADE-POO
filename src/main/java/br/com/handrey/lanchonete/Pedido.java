package br.com.handrey.lanchonete;

public class Pedido {

    private Lanche lanche;

    public static int totalPedidos = 0;

    public Pedido(Lanche lanche) {
        this.lanche = lanche;
        totalPedidos++;
    }

    public void exibir() {
        System.out.println("Pedido:");
        lanche.exibir();
    }
}