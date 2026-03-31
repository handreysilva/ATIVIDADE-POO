package br.com.handrey.academia;

public class Aluno {

    private String nome;
    private int idade;
    private String plano;

    public static int totalAlunos = 0;
    public static final int LIMITE_ALUNOS = 50;

    public Aluno(String nome, int idade, String plano) {
        this.nome = nome;
        setIdade(idade);
        this.plano = plano;
        totalAlunos++;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPlano() {
        return plano;
    }

    public void setIdade(int idade) {
        if (idade < 14) {
            System.out.println("Idade inválida! Mínimo 14 anos.");
        } else {
            this.idade = idade;
        }
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Plano: " + plano);
    }
}