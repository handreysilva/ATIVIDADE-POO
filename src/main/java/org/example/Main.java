package org.example;

public class Main {

    public static void main(String[] args) {

        // criando vários carros
        Carro c1 = new Carro("Toyota", "Corolla", 2020);
        Carro c2 = new Carro("Honda", "Civic", 2022);
        Carro c3 = new Carro();
        Carro c4 = new Carro();
        Carro c5 = new Carro("Ford", "Focus", 2018);

        // mostrando total de carros criados
        System.out.println("Total de carros criados: " + Carro.totalCarros);

        /*
        STATIC:

        - totalCarros pertence à CLASSE, não ao objeto
        - Todos os objetos compartilham essa variável

        Por isso usamos:
        Carro.totalCarros

        E não:
        c1.totalCarros

        DIFERENÇA:

        Atributo normal:
        → cada objeto tem o seu

        Atributo static:
        → existe apenas UM para toda a classe
        */
    }
}