package org.example;

public class Main {

    public static void main(String[] args) {

        Carro c1 = new Carro("Fiat", "Uno", 2020);
        Carro c2 = c1;

        c2.setModelo("Palio");

        System.out.println(c1.getModelo());
        System.out.println(c2.getModelo());

        /*
        OBJETOS (REFERÊNCIA):

        - c1 guarda o endereço do objeto
        - c2 recebe o MESMO endereço

        Ou seja:
        c1 e c2 apontam para o MESMO objeto

        Alterar c2 altera o mesmo objeto que c1 aponta
        */
    }
}
/*
Diferença entre primitivo e objeto:

- Primitivo (int):
  → armazenado na STACK
  → guarda valor direto
  → cópia independente

- Objeto (Carro):
  → objeto fica na HEAP
  → variável guarda referência (endereço)
  → múltiplas variáveis podem apontar para o mesmo objeto

Por isso:
- Alterar objeto afeta todas as referências
*/