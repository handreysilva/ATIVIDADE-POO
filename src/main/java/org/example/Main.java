package org.example;

public class Main {

    public static void main(String[] args) {

        Carro c1 = new Carro("Toyota", "Corolla", 2020);
        Carro c2 = new Carro("Honda", "Civic", 2022);

        // chamando método static
        Carro.imprimirTotal();

        /*
        MÉTODO STATIC:

        - Chamado pela classe, não pelo objeto
        - Não precisa de "new"

        Por isso:
        Carro.imprimirTotal();

        E não:
        c1.imprimirTotal();
        */
    }
}