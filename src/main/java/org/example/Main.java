package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // criando lista de carros
        ArrayList<Carro> listaCarros = new ArrayList<>();

        // criando carros
        Carro c1 = new Carro();
        c1.marca = "Toyota";
        c1.modelo = "Corolla";
        c1.ano = 2020;

        Carro c2 = new Carro();
        c2.marca = "Honda";
        c2.modelo = "Civic";
        c2.ano = 2022;

        Carro c3 = new Carro();
        c3.marca = "Ford";
        c3.modelo = "Focus";
        c3.ano = 2018;

        // adicionando na lista
        listaCarros.add(c1);
        listaCarros.add(c2);
        listaCarros.add(c3);

        // percorrendo com for-each
        for (Carro carro : listaCarros) {
            carro.exibir();
            System.out.println("Idade: " + carro.idadeDoCarro());
            System.out.println("----------------------");
        }

        /*
        ArrayList:
        - É uma lista dinâmica (pode crescer)
        - Armazena vários objetos do mesmo tipo

        for-each:
        - Percorre automaticamente todos os elementos da lista
        - A cada volta, "carro" representa um item da lista

        Exemplo:
        listaCarros = [c1, c2, c3]
        O for-each vai passar por todos automaticamente
        */
    }
}