package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_05;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Filme> filmes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int codigo;
        do {
            System.out.println("Insira o código do filme escolhido(0 para finalizar): ");
            codigo = sc.nextInt();
            sc.nextLine();  

            if (codigo != 0) {
                System.out.println("Digite o título do filme: ");
                String titulo = sc.nextLine();
        
                System.out.println("Digite o Gênero do filme: ");
                String genero = sc.nextLine();

                System.out.println("Digite o Ano de lançamento do filme: ");
                int ano = sc.nextInt();
                sc.nextLine();
                
                System.out.println("Digite o Ator Principal do filme: ");
                String mainActor = sc.nextLine();

                Filme filme = new Filme(codigo, titulo, genero, ano, mainActor);
                filmes.add(filme);

                System.out.println("\n");
                System.out.println("Imprimindo os dados do filme inserido: ");
                System.out.println(filme);
                
                System.out.println("\nPróximo filme!!!!!");
            }

        } while(codigo != 0);
        
        System.out.println("Total de filmes registrados: " +  Filme.totalFilmes());
        System.exit(0);
    }
}
