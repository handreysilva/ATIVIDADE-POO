package br.com.handrey.estacionamento;

public class Carro {

    private String placa;
    private String modelo;

    public Carro(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void exibir() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
    }
}