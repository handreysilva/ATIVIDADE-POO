package org.example;

public class Magit in {

    public static void main(String[] args) {

        // Criando primeiro objeto da classe Carro
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;

        // Criando segundo objeto da classe Carro
        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2022;

        // Imprimindo dados do primeiro carro
        System.out.println("Carro 1:");
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);

        System.out.println("------------------------");

        // Imprimindo dados do segundo carro
        System.out.println("Carro 2:");
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);

        // Explicação (coloque como comentário no código)
        /*
        Criamos objetos da classe Carro usando a palavra "new".
        Cada objeto possui seus próprios valores para marca, modelo e ano.
        Aqui estamos acessando os atributos diretamente (sem encapsulamento).
        */
    }
}