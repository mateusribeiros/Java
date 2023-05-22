package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_06;
import java.util.ArrayList;

public class Item {
    private String titulo;
    private int ano;
    private int duracao;
    private ArrayList<String> comentarios = new ArrayList<>();

    public Item(String titulo, int ano, int duracao, ArrayList<String> comentarios) {
        this.titulo = titulo;
        this.ano = ano;
        this.duracao = duracao;
        this.comentarios = comentarios;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public int getAno() {
        return ano;
    }

    public int getDuracao() {
        return duracao; 
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public void mostrarAtributos() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Comentários: " + comentarios);
    }
}
