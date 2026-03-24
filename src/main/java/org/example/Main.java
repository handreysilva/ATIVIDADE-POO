package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Carro> listaCarros = new ArrayList<>();

        // agora criando direto com construtor
        Carro c1 = new Carro("Toyota", "Corolla", 2020);
        Carro c2 = new Carro("Honda", "Civic", 2022);
        Carro c3 = new Carro("Ford", "Focus", 1800); // inválido

        listaCarros.add(c1);
        listaCarros.add(c2);
        listaCarros.add(c3);

        for (Carro carro : listaCarros) {
            carro.exibir();
            System.out.println("Idade: " + carro.idadeDoCarro());
            System.out.println("----------------------");
        }

        /*
        CONSTRUTOR:
        - É executado quando o objeto é criado
        - Serve para inicializar os atributos

        Vantagem:
        - Evita ter que usar vários setters
        - Objeto já nasce pronto

        Antes:
        Carro c = new Carro();
        c.setMarca("Toyota");
        c.setModelo("Corolla");

        Agora:
        Carro c = new Carro("Toyota", "Corolla", 2020);
        */
    }
}