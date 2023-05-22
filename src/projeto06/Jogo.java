package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_06;
import java.util.ArrayList;

public class Jogo extends Item {
    private int numeroJogadores;
    private String plataforma;

    public Jogo(String titulo, int ano, int duracao, ArrayList<String> comentarios, int numJogadores, String plataforma) {
        super(titulo, ano, duracao, comentarios);
        this.numeroJogadores = numJogadores;
        this.plataforma = plataforma;
    }

    public int getNumeroJogadores() {
        return numeroJogadores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setNumeroJogadores(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void mostrarDados() {
        mostrarAtributos();
        System.out.println("Número de jogadores: " + numeroJogadores);
        System.out.println("Plataforma: " + plataforma);
    }
}
