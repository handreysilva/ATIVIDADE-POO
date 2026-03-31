package br.com.handrey.lanchonete;

public class Lanche {

    private String nome;
    private double preco;

    public Lanche(String nome, double preco) {
        this.nome = nome;
        setPreco(preco); // validação
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço inválido!");
        } else {
            this.preco = preco;
        }
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}