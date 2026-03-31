package br.com.handrey.academia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=======================");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Total de alunos");
            System.out.println("0 - Sair");
            System.out.println("=======================");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    // valida limite
                    if (Aluno.totalAlunos >= Aluno.LIMITE_ALUNOS) {
                        System.out.println("Academia lotada! Não aceita mais alunos.");
                    } else {
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Idade: ");
                        int idade = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Plano (mensal/anual): ");
                        String plano = sc.nextLine();

                        Aluno aluno = new Aluno(nome, idade, plano);
                        lista.add(aluno);

                        System.out.println("Aluno cadastrado!");
                    }
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Aluno a : lista) {
                            System.out.println("------------------");
                            a.exibir();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Total de alunos: " + Aluno.totalAlunos);
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