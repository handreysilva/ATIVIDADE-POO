package org.example;

public class Carro {

    // atributos agora são privados (encapsulamento)
    private String marca;
    private String modelo;
    private int ano;

    // GETTERS (pegam o valor)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // SETTERS (alteram o valor)
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        // validação
        if (ano < 1886 || ano > 2026) {
            System.out.println("Erro: ano inválido!");
        } else {
            this.ano = ano;
        }
    }

    // método exibir atualizado
    public void exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public int idadeDoCarro() {
        return 2026 - ano;
    }
}