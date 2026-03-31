package br.com.handrey.delivery;

public class Marmita {

    private String descricao;
    private String tamanho;

    // preços fixos
    public static final double PRECO_P = 18.0;
    public static final double PRECO_M = 25.0;
    public static final double PRECO_G = 32.0;

    public Marmita(String descricao, String tamanho) {
        this.descricao = descricao;
        this.tamanho = tamanho.toUpperCase();
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTamanho() {
        return tamanho;
    }

    // método com retorno (preço)
    public double getPreco() {
        switch (tamanho) {
            case "P":
                return PRECO_P;
            case "M":
                return PRECO_M;
            case "G":
                return PRECO_G;
            default:
                return 0;
        }
    }

    public void exibir() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço: R$ " + getPreco());
    }
}