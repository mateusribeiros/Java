package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_05;

public class Filme {
    private int cod;
    private String nome;
    private String genero;
    private int ano;
    private String mainActor;
    private static int quantFilmes = 0;

    /* CONSTRUCTOR */
    public Filme(int codigo, String nome) {
        this.cod = codigo;
        this.nome = nome;
        quantFilmes++;
    }

    public Filme(int codigo, String nome, String genero, int ano, String mainActor) {
        this.cod = codigo;
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.mainActor = mainActor;
        quantFilmes++;
    }

    /* GETTERS E SETTERS */
    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getAno() {
        return ano;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    /* MÉTODOS */
    public static int totalFilmes() {
        return quantFilmes;
    }

    public String toString() {
        return "Nome: " + nome + "\n Código: " + cod + "\n Gênero: " + genero + "\n Ano: " + ano + "\n Ator Principal: " + mainActor + "!\n";
    }
}
