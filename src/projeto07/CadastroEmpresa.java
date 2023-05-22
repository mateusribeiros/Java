package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_07;

import java.util.Scanner;
import java.util.ArrayList;

public class CadastroEmpresa {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Empresa");
        System.out.print("Digite o CNPJ da empresa: ");
        String cnpj = scanner.nextLine();

        System.out.print("Digite o nome da empresa: ");
        String nome = scanner.nextLine();

        Empresa empresa = new Empresa(cnpj, nome);

        System.out.println("\nCadastro de Funcionários");

        // Cadastrar 5 funcionários
        for(int i=1; i <= 5; i++) {
            String name = "funcionario0" + i;
            String cpf = "111.111.111-11";
            double salario = 1212 * i;
            
            Funcionario funcionario = new Funcionario(name, cpf, salario);
            funcionarios.add(funcionario);
            empresa.AddFuncionario(funcionario);
        }

        System.out.println("\nFuncionários cadastrados na empresa:");
        empresa.mostrarFuncionarios();

        scanner.close();
    }
}
