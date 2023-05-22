package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Morador> moradores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String opcao;
        do {
            System.out.println("Cadastro de Morador");
            System.out.println("-------------------");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("Celular: ");
            String celular = scanner.nextLine();

            System.out.print("Data de Nascimento: ");
            String dataNascimento = scanner.nextLine();

            System.out.print("Sexo: ");
            String sexo = scanner.nextLine();

            System.out.print("Bloco: ");
            String bloco = scanner.nextLine();

            System.out.print("Apartamento: ");
            String apartamento = scanner.nextLine();

            System.out.print("Código de Acesso: ");
            String codigoAcesso = scanner.nextLine();

            Morador morador = new Morador(nome, cpf, celular, dataNascimento, sexo, bloco, apartamento, codigoAcesso);
            moradores.add(morador);

            System.out.print("Deseja cadastrar outro morador? (S/N): ");
            opcao = scanner.nextLine();
            System.out.println();
        } while (opcao.equalsIgnoreCase("S"));

        for (Morador morador : moradores) {
            morador.mostrarDados();
        }
    }
}
