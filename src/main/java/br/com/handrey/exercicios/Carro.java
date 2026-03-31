package br.com.handrey.exercicios;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    // constante
    public static final int ANO_PRIMEIRO_CARRO = 1886;

    // contador
    public static int totalCarros = 0;

    // construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano); // validação
        totalCarros++;
    }

    // getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if (ano < ANO_PRIMEIRO_CARRO || ano > 2026) {
            System.out.println("Ano inválido!");
        } else {
            this.ano = ano;
        }
    }

    // exibir
    public void exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}