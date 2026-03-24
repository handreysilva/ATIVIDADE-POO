package org.example;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    // atributo STATIC (pertence à classe, não ao objeto)
    public static int totalCarros = 0;

    // CONSTRUTOR COM PARÂMETROS
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;

        if (ano < 1886 || ano > 2026) {
            System.out.println("Erro: ano inválido!");
        } else {
            this.ano = ano;
        }

        totalCarros++; // incrementa sempre que cria um carro
    }

    // CONSTRUTOR VAZIO
    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;

        totalCarros++; // também conta aqui
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