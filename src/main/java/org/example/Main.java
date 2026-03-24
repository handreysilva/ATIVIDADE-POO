package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Carro> listaCarros = new ArrayList<>();

        Carro c1 = new Carro();
        c1.setMarca("Toyota");
        c1.setModelo("Corolla");
        c1.setAno(2020);

        Carro c2 = new Carro();
        c2.setMarca("Honda");
        c2.setModelo("Civic");
        c2.setAno(2022);

        Carro c3 = new Carro();
        c3.setMarca("Ford");
        c3.setModelo("Focus");
        c3.setAno(1800); // inválido (vai mostrar erro)

        listaCarros.add(c1);
        listaCarros.add(c2);
        listaCarros.add(c3);

        for (Carro carro : listaCarros) {
            carro.exibir();
            System.out.println("Idade: " + carro.idadeDoCarro());
            System.out.println("----------------------");
        }

        /*
        ENCAPSULAMENTO:
        - Protege os dados da classe
        - Só permite acesso através de métodos (get e set)

        Antes:
        carro.marca = "Toyota" ❌

        Agora:
        carro.setMarca("Toyota") ✅

        VALIDAÇÃO:
        - O setter do ano impede valores inválidos
        - Isso evita erros no sistema

        Vantagem:
        - Mais segurança
        - Mais controle sobre os dados
        */
    }
}