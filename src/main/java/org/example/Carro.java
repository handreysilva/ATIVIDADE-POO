package org.example;

public class Carro {

    // atributos
    String marca;
    String modelo;
    int ano;

    // método que apenas executa (não retorna nada)
    void exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    // método que retorna um valor
    int idadeDoCarro() {
        return 2026 - ano;
    }
}