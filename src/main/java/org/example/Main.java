package org.example;

public class Main {

    public static void main(String[] args) {

        int x; // declarada fora

        if (true) {
            x = 10; // atribuída dentro
        }

        System.out.println(x); // agora funciona
    }
}
/*
ESCOPO:

- Escopo é a região onde uma variável existe
- A variável x foi criada dentro do if
- Fora do if ela não existe

Por isso deu erro

Correção:
- Declarar a variável fora do bloco

Resumo:
- Variáveis só existem dentro do bloco onde foram criadas
*/