package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_06;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Item> itens = new ArrayList<>();

        /* Informações dos 10 CDS, FILMES E JOGOS */
        String[][] cdsInfo = {
            {"CD1", "2000", "60", "Ótimo CD", "Artista1", "12"},
            {"CD2", "2001", "45", "Bom CD", "Artista2", "10"},
            {"CD3", "2002", "60", "Ótimo CD", "Artista3", "12"},
            {"CD4", "2003", "45", "Bom CD", "Artista4", "10"},
            {"CD5", "2004", "60", "Ótimo CD", "Artista5", "12"},
            {"CD6", "2005", "45", "Bom CD", "Artista6", "10"},
            {"CD7", "2006", "60", "Ótimo CD", "Artista7", "12"},
            {"CD8", "2007", "45", "Bom CD", "Artista8", "10"},
            {"CD9", "2008", "60", "Ótimo CD", "Artista9", "12"},
            {"CD10", "2009", "45", "Bom CD", "Artista10", "10"},
        };

        String[][] filmesInfo = {
            {"Filme1", "2019", "120", "Ótimo filme", "Diretor1"},
            {"Filme2", "2018", "100", "Bom filme", "Diretor2"},
            {"Filme3", "2019", "120", "Ótimo filme", "Diretor3"},
            {"Filme4", "2018", "100", "Bom filme", "Diretor4"},
            {"Filme5", "2019", "120", "Ótimo filme", "Diretor5"},
            {"Filme6", "2018", "100", "Bom filme", "Diretor6"},
            {"Filme7", "2019", "120", "Ótimo filme", "Diretor7"},
            {"Filme8", "2018", "100", "Bom filme", "Diretor8"},
            {"Filme9", "2019", "120", "Ótimo filme", "Diretor9"},
            {"Filme10", "2018", "100", "Bom filme", "Diretor10"},
        };

        String[][] jogosInfo = {
            {"Jogo1", "2022", "60", "Ótimo jogo", "2", "PS4"},
            {"Jogo2", "2023", "90", "Bom jogo", "4", "Xbox One"},
            {"Jogo3", "2022", "60", "Ótimo jogo", "2", "PS4"},
            {"Jogo4", "2023", "90", "Bom jogo", "4", "Xbox One"},
            {"Jogo5", "2022", "60", "Ótimo jogo", "2", "PS4"},
            {"Jogo6", "2023", "90", "Bom jogo", "4", "Xbox One"},
            {"Jogo7", "2022", "60", "Ótimo jogo", "2", "PS4"},
            {"Jogo8", "2023", "90", "Bom jogo", "4", "Xbox One"},
            {"Jogo9", "2022", "60", "Ótimo jogo", "2", "PS4"},
            {"Jogo10", "2023", "90", "Bom jogo", "4", "Xbox One"},
        };

        /*Criando os 10 FILMES, CD E JOGOS  */
        for(String[] cdInfo: cdsInfo) {
            String titulo = cdInfo[0];
            int ano = Integer.parseInt(cdInfo[1]);
            int duracao = Integer.parseInt(cdInfo[2]);
            ArrayList<String> comentarios = new ArrayList<>();
            comentarios.add(cdInfo[3]);
            String artista = cdInfo[4];
            int quantFaixas = Integer.parseInt(cdInfo[5]);
            itens.add(new CD(titulo, ano, duracao, comentarios, artista, quantFaixas));
        }

        for(String[] jogoInfo: jogosInfo) {
            String titulo = jogoInfo[0];
            int ano = Integer.parseInt(jogoInfo[1]);
            int duracao = Integer.parseInt(jogoInfo[2]);
            ArrayList<String> comentarios = new ArrayList<>();
            comentarios.add(jogoInfo[3]);
            int numeroJogadores = Integer.parseInt(jogoInfo[4]);
            String plataforma = jogoInfo[5];
            itens.add(new Jogo(titulo, ano, duracao, comentarios, numeroJogadores, plataforma));
        }

        for(String[] filmeInfo: filmesInfo) {
            String titulo = filmeInfo[0];
            int ano = Integer.parseInt(filmeInfo[1]);
            int duracao = Integer.parseInt(filmeInfo[2]);
            ArrayList<String> comentarios = new ArrayList<>();
            comentarios.add(filmeInfo[3]);
            String diretor = filmeInfo[4];
            itens.add(new Filme(titulo, ano, duracao, comentarios, diretor));
        }

        /* Imprimindo */
        for(Item item : itens) {
            if(item instanceof CD) {
                CD cd = (CD) item;
                cd.mostrarDados();
            } else if(item instanceof Jogo) {
                Jogo jogo = (Jogo) item;
                jogo.mostrarDados();
                System.out.println("Plataforma: " + jogo.getPlataforma());
            } else if(item instanceof Filme) {
                Filme filme = (Filme) item;
                filme.mostrarDados();
            }
            System.out.println("#########################################################");
        }
    }
}
