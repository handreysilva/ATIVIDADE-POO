package org.example;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public static int totalCarros = 0;

    // construtor com parâmetros
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;

        if (ano < 1886 || ano > 2026) {
            System.out.println("Erro: ano inválido!");
        } else {
            this.ano = ano;
        }

        totalCarros++;
    }

    // construtor vazio
    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;

        totalCarros++;
    }

    // MÉTODO STATIC
    public static void imprimirTotal() {
        System.out.println("Total de carros: " + totalCarros);

        // TESTE (DESCOMENTE PARA VER O ERRO)
        // System.out.println(modelo);

        /*
        Isso dá erro porque:

        - método static NÃO pertence ao objeto
        - pertence à classe

        - "modelo" é atributo de INSTÂNCIA (objeto)
        - o método static não sabe qual objeto usar

        Por isso NÃO pode acessar diretamente
        */
    }

    // getters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }

    // setters
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public void setAno(int ano) {
        if (ano < 1886 || ano > 2026) {
            System.out.println("Erro: ano inválido!");
        } else {
            this.ano = ano;
        }
    }

    public void exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public int idadeDoCarro() {
        return 2026 - ano;
    }
}