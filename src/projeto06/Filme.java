package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_06;
import java.util.ArrayList;

public class Filme extends Item {
    private String diretor;

    public Filme(String titulo, int ano, int duracao, ArrayList<String> comentarios, String diretor) {
        super(titulo, ano, duracao, comentarios);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }
    
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void mostrarDados() {
        mostrarAtributos();
        System.out.println("Diretor: " + diretor);
    }


}
