package org.example;

public class Main {

    public static void main(String[] args) {

        // criando objetos
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2022;

        // chamando método void (só executa)
        System.out.println("Carro 1:");
        carro1.exibir();

        // chamando método com retorno
        System.out.println("Idade do carro: " + carro1.idadeDoCarro());

        System.out.println("----------------------");

        System.out.println("Carro 2:");
        carro2.exibir();
        System.out.println("Idade do carro: " + carro2.idadeDoCarro());

        /*
        MÉTODO VOID:
        - Não retorna valor
        - Apenas executa uma ação (exibir dados)

        MÉTODO COM RETORNO:
        - Retorna um valor (int neste caso)
        - Pode ser usado dentro de um println ou variável

        Diferença:
        - void → faz algo
        - int (ou outro tipo) → devolve algo
        */
    }
}