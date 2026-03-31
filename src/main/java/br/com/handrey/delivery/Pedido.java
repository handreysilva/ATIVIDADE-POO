package br.com.handrey.delivery;

public class Pedido {

    private String cliente;
    private Marmita marmita;

    public static int totalPedidos = 0;
    public static double totalVendido = 0;

    public Pedido(String cliente, Marmita marmita) {
        this.cliente = cliente;
        this.marmita = marmita;
        totalPedidos++;
        totalVendido += marmita.getPreco();
    }

    public void exibir() {
        System.out.println("Cliente: " + cliente);
        marmita.exibir();
    }
}