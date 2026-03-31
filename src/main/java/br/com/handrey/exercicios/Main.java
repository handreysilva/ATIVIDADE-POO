package br.com.handrey.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=======================");
            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Listar todos");
            System.out.println("3 - Total cadastrado");
            System.out.println("4 - Sair");
            System.out.println("=======================");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    sc.nextLine();

                    Carro carro = new Carro(marca, modelo, ano);
                    lista.add(carro);

                    System.out.println("Carro cadastrado!");
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum carro cadastrado.");
                    } else {
                        for (Carro c : lista) {
                            System.out.println("------------------");
                            c.exibir();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Total de carros: " + Carro.totalCarros);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        sc.close();
    }
}