package org.example;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = a;
        b = 99;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
        TIPOS PRIMITIVOS:

        - Variáveis primitivas (int, double, etc) guardam VALOR diretamente
        - Quando fazemos b = a, copiamos o valor

        Depois:
        - Alterar b NÃO altera a

        Resultado:
        a = 10
        b = 99
        */
    }
}
/*
Tipos primitivos são armazenados por valor.

Quando atribuímos b = a:
- o valor é copiado

Alterar b não afeta a,
pois cada variável tem seu próprio espaço na memória.
*/