package org.example;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public static int totalCarros = 0;

    // CONSTANTE (final)
    public static final int ANO_PRIMEIRO_CARRO = 1886;

    // construtor com parâmetros
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;

        if (ano < ANO_PRIMEIRO_CARRO || ano > 2026) {
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

    // método static
    public static void imprimirTotal() {
        System.out.println("Total de carros: " + totalCarros);
    }

    // getters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }

    // setters
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public void setAno(int ano) {
        if (ano < ANO_PRIMEIRO_CARRO || ano > 2026) {
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