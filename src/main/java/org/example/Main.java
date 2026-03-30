package org.example;

public class Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("João", "joao@email.com");
        Cliente c2 = new Cliente("Maria", "maria@email.com");
        Cliente c3 = new Cliente("Pedro");

        System.out.println("CLIENTE 1:");
        c1.exibir();

        System.out.println("------------------");

        System.out.println("CLIENTE 2:");
        c2.exibir();

        System.out.println("------------------");

        System.out.println("CLIENTE 3:");
        c3.exibir();

        System.out.println("------------------");

        System.out.println("Total de clientes: " + Cliente.totalClientes);
    }
}