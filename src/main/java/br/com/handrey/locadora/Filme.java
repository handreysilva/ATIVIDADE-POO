package br.com.handrey.locadora;

public class Filme {

    private String titulo;
    private String genero;
    private int ano;

    public static int totalFilmes = 0;

    public static final int ANO_MINIMO = 1895;

    public Filme(String titulo, String genero, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        setAno(ano); // validação
        totalFilmes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < ANO_MINIMO || ano > 2026) {
            System.out.println("Ano inválido!");
        } else {
            this.ano = ano;
        }
    }

    // método com retorno
    public String tipoFilme() {
        if (ano < 2000) {
            return "Clássico";
        } else {
            return "Recente";
        }
    }

    public void exibir() {
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + ano);
        System.out.println("Tipo: " + tipoFilme());
    }
}