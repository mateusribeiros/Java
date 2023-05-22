package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_09;

public class Livro {
    private String titulo;
    private int cod;
    private Pessoa autor;
    private String editora;
    private String edicao;
    private int ano;
    private String local;
    private String genero;
    private static int quantLivros = 0;
    private static int[] totalGeneros = new int[5];

    /* CONSTRUCTORS */
    public Livro(String titulo, int cod, Pessoa autor, String editora, String edicao, int ano, String local, String genero) {
        this.ano = ano;
        this.titulo = titulo;
        this.cod = cod;
        this.autor = autor;
        this.edicao = edicao;
        this.editora = editora;
        this.local = local;
        this.genero = genero;
        quantLivros++;
        incrementarTotalGenero(genero);
    }

    public Livro() {
        this.ano = ano;
        this.titulo = titulo;
        this.cod = cod;
        this.autor = autor;
        this.edicao = edicao;
        this.editora = editora;
        this.local = local;
        this.genero = genero;
        quantLivros++;
    }

    /* GETTERS */
    public int getAno() {
        return ano;
    }
    public Pessoa getAutor() {
        return autor;
    }
    public int getCod() {
        return cod;
    }
    public String getEdicao() {
        return edicao;
    }
    public String getEditora() {
        return editora;
    }
    public String getGenero() {
        return genero;
    }
    public String getLocal() {
        return local;
    }
    public String getTitulo() {
        return titulo;
    }

    /* SETTERS */
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /* MÉTODOS */
    public void mostrarDados() {
        System.out.printf("Código: %02d\n", cod);
        System.out.printf("Título: %s\n", titulo);
        System.out.printf("Gênero: %s\n", genero);
        System.out.printf("Referência: %s\n", this.autor.retornarAssinatura());
        System.out.printf("%s.        %s. %s: %s, %02d.\n", titulo, edicao, local, editora, ano);
    }

    public static void mostrarQuantLivros() {
        System.out.println("Total de livros armazenados: " + quantLivros);
    }

    public static void mostrarTotalGeneros() {
        System.out.println("Total de Livros por gênero: ");
        for(int i = 0; i < totalGeneros.length; i++) {
            if(i == 0) System.out.printf("Gênero Terror: %d livros(s)\n", totalGeneros[i]);
            if(i == 1) System.out.printf("Gênero Suspense: %d livros(s)\n", totalGeneros[i]);
            if(i == 2) System.out.printf("Gênero Romance: %d livros(s)\n", totalGeneros[i]);
            if(i == 3) System.out.printf("Gênero Acao: %d livros(s)\n", totalGeneros[i]);
            if(i == 4) System.out.printf("Gênero Cientifico: %d livros(s)\n", totalGeneros[i]);
        }
    }

    public static void incrementarTotalGenero(String genero) {
        switch (genero) {
            case "Terror":
                totalGeneros[0]++;
                break;
            case "Suspense":
                totalGeneros[1]++;
                break;
            case "Romance":
                totalGeneros[2]++;
                break;
            case "Acao":
                totalGeneros[3]++;
                break;
            case "Cientifico":
                totalGeneros[4]++;
                break;
            default:
                break;
        }
    }

}
