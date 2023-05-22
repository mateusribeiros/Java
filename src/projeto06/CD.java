package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_06;
import java.util.ArrayList;

public class CD extends Item{
    private String artista;
    private int quantFaixas;

    public CD(String titulo, int ano, int duracao, ArrayList<String> comentarios, String artista, int quantFaixas) {
        super(titulo, ano, duracao, comentarios);
        this.artista = artista;
        this.quantFaixas = quantFaixas;
    }

    public String getArtista() {
        return artista;
    }

    public int getQuantFaixas() {
        return quantFaixas;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    public void setQuantFaixas(int quantFaixas) {
        this.quantFaixas = quantFaixas;
    }

    public void mostrarDados() {
        mostrarAtributos();
        System.out.println("Artista: " + artista);
        System.out.println("Número de faixas: " + quantFaixas);
    }
}
