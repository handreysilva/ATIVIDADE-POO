package br.com.handrey.delivery;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Marmita> cardapio = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n========================");
            System.out.println("1 - Cadastrar Marmita");
            System.out.println("2 - Fazer Pedido");
            System.out.println("3 - Listar Pedidos");
            System.out.println("4 - Total de Pedidos");
            System.out.println("5 - Total Vendido");
            System.out.println("0 - Sair");
            System.out.println("========================");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Descrição: ");
                    String desc = sc.nextLine();

                    System.out.print("Tamanho (P/M/G): ");
                    String tam = sc.nextLine();

                    Marmita marmita = new Marmita(desc, tam);
                    cardapio.add(marmita);

                    System.out.println("Marmita cadastrada!");
                    break;

                case 2:
                    if (cardapio.isEmpty()) {
                        System.out.println("Nenhuma marmita cadastrada.");
                    } else {
                        System.out.print("Nome do cliente: ");
                        String cliente = sc.nextLine();

                        System.out.println("Escolha a marmita:");

                        for (int i = 0; i < cardapio.size(); i++) {
                            System.out.println(i + " - " + cardapio.get(i).getDescricao());
                        }

                        int escolha = sc.nextInt();
                        sc.nextLine();

                        Pedido pedido = new Pedido(cliente, cardapio.get(escolha));
                        pedidos.add(pedido);

                        System.out.println("Pedido realizado!");
                    }
                    break;

                case 3:
                    if (pedidos.isEmpty()) {
                        System.out.println("Nenhum pedido.");
                    } else {
                        for (Pedido p : pedidos) {
                            System.out.println("------------------");
                            p.exibir();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Total de pedidos: " + Pedido.totalPedidos);
                    break;

                case 5:
                    System.out.println("Total vendido: R$ " + Pedido.totalVendido);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}