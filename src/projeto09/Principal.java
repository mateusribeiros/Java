package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_09;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int cod;
        int aux = 0;
        do {
            System.out.println("Insira o código do livro(0 para finalizar): ");
            cod = sc.nextInt();
            sc.nextLine();

            if(cod != 0) {
                System.out.println("Insira o título do livro: ");
                String titulo = sc.nextLine();
                
                System.out.println("Insira o nome do autor: ");
                String nomeAutor = sc.nextLine();
                
                System.out.println("Insira o sobrenome do autor: ");
                String sobrenomeAutor = sc.nextLine();
                
                System.out.println("Insira o nome intermediário do autor: ");
                String nomeIntermediarioAutor = sc.nextLine();
                
                Pessoa autor = new Pessoa(nomeAutor, sobrenomeAutor, nomeIntermediarioAutor);
                
                System.out.println("Insira a editora do livro: ");
                String editora = sc.nextLine();
                
                System.out.println("Insira a edição do livro: ");
                String edicao = sc.nextLine();
                
                System.out.println("Insira o ano do livro: ");
                int ano = sc.nextInt();
                sc.nextLine();
                
                System.out.println("Insira o local do livro: ");
                String local = sc.nextLine();
                
                System.out.println("Insira o gênero do livro: ");
                String genero = sc.nextLine();

                Livro livro = new Livro(titulo, cod, autor, editora, edicao, ano, local, genero);
                livros.add(livro);
            }
    
        } while(cod != 0);

        for(Livro livro: livros) {
            System.out.println("-----------------------------");
            livro.mostrarDados();
            System.out.println("\n");
        }

        Livro.mostrarQuantLivros();
        System.out.println();
        Livro.mostrarTotalGeneros();
    }
}
