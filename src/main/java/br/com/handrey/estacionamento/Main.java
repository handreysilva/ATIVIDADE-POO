package br.com.handrey.estacionamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> lista = new ArrayList<>();

        final int TOTAL_VAGAS = 20; // constante (final)

        int opcao;

        do {
            System.out.println("\n=======================");
            System.out.println("1 - Entrada de carro");
            System.out.println("2 - Saída de carro");
            System.out.println("3 - Ver vagas");
            System.out.println("0 - Sair");
            System.out.println("=======================");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    // entrada
                    if (lista.size() >= TOTAL_VAGAS) {
                        System.out.println("Estacionamento LOTADO!");
                    } else {
                        System.out.print("Placa: ");
                        String placa = sc.nextLine();

                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();

                        Carro carro = new Carro(placa, modelo);
                        lista.add(carro);

                        System.out.println("Carro entrou!");
                    }
                    break;

                case 2:
                    // saída
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum carro no estacionamento.");
                    } else {
                        System.out.print("Digite a placa para remover: ");
                        String placaSaida = sc.nextLine();

                        boolean removido = false;

                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).getPlaca().equalsIgnoreCase(placaSaida)) {
                                lista.remove(i);
                                System.out.println("Carro saiu!");
                                removido = true;
                                break;
                            }
                        }

                        if (!removido) {
                            System.out.println("Carro não encontrado.");
                        }
                    }
                    break;

                case 3:
                    // vagas
                    int ocupadas = lista.size();
                    int livres = TOTAL_VAGAS - ocupadas;

                    System.out.println("Vagas ocupadas: " + ocupadas);
                    System.out.println("Vagas livres: " + livres);
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