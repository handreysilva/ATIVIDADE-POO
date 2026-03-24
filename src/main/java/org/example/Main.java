package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Carro> listaCarros = new ArrayList<>();

        // usando construtor com parâmetros
        Carro c1 = new Carro("Toyota", "Corolla", 2020);

        // usando construtor vazio
        Carro c2 = new Carro();

        listaCarros.add(c1);
        listaCarros.add(c2);

        for (Carro carro : listaCarros) {
            carro.exibir();
            System.out.println("Idade: " + carro.idadeDoCarro());
            System.out.println("----------------------");
        }

        /*
        SOBRECARGA DE CONSTRUTOR:

        - Podemos ter vários construtores na mesma classe
        - O que muda são os parâmetros

        Diferença:

        Construtor com parâmetros:
        → Objeto nasce com valores definidos

        Construtor vazio:
        → Objeto nasce com valores padrão

        Isso dá mais flexibilidade no código
        */
    }
}