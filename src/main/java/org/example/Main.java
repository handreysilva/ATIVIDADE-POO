package org.example;

public class Main {

    public static void main(String[] args) {

        Carro c1 = new Carro("Toyota", "Corolla", 2020);
        Carro c2 = new Carro("Ford", "Focus", 1800); // inválido

        Carro.imprimirTotal();

        // TESTE (DESCOMENTE PRA VER ERRO)
        // Carro.ANO_PRIMEIRO_CARRO = 1900;

        /*
        FINAL:

        - Uma variável final NÃO pode ser alterada
        - É uma constante

        Por isso usamos:
        static final

        SIGNIFICA:
        - static → pertence à classe
        - final → valor fixo

        Exemplo:
        ANO_PRIMEIRO_CARRO = 1886

        Se tentar mudar:
        → dá erro de compilação

        Vantagem:
        - evita valores mágicos no código
        - melhora organização e segurança
        */
    }
}