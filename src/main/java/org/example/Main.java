package org.example;

public class Main {

    public static void main(String[] args) {

        Carro meuCarro = new Carro("VW", "Gol", 2015);

        trocarModelo(meuCarro);

        System.out.println(meuCarro.getModelo());

        /*
        Chamamos o método passando o objeto

        O objeto foi alterado dentro do método
        */
    }

    public static void trocarModelo(Carro c) {
        c.setModelo("Fusca");

        /*
        O parâmetro "c" aponta para o MESMO objeto que meuCarro

        Não é uma cópia do objeto!
        */
    }
}
/*
O parâmetro c aponta para o mesmo objeto que meuCarro.

Quando o método recebe um objeto, ele recebe a referência (endereço),
não uma cópia.

Por isso, alterações feitas dentro do método afetam o objeto original.
*/