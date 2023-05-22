package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_01;

public class Curso {
    private String nome;
    private String sigla;
    
    public Curso(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }


    public String toString() {
        return "Nome: " + nome + ", " + "Sigla: " + sigla;
    }
}
