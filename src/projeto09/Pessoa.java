package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_09;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String nomeIntermediario;
    
    /* CONSTRUCTORS */
    public Pessoa() {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeIntermediario = nomeIntermediario;
    }

    public Pessoa(String nome, String sobrenome, String nomeIntermediario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeIntermediario = nomeIntermediario;
    }

    /* MÉTODOS */
    public String retornarAssinatura() {
        return sobrenome + ", " + nome.charAt(0) + ". " + nomeIntermediario.charAt(0) + ".";
    }

}
