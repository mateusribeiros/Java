package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_07;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();
        ArrayList<Vendedor> vendedores = new ArrayList<>();


        /* Informações das vendas anuais de cada vendedor */
        int[] vendasAmanda = {100,200,150,100,101,100,200,90,100,140,120,110};
        int[] vendasFabricio = {100,200,150,100,101,100,200,90,100,140,120,110};
        int[] vendasJoao = {100,200,150,100,101,100,200,90,100,140,120,110};
        int[] vendasPedro = {100,200,150,100,101,100,200,90,100,140,120,110};
        int[] vendasMurilo = {100,200,150,100,101,100,200,90,100,140,120,110};
        
        /* Criando 5 funcionários, 2 gerentes e 5 vendedores */
        Gerente gerente01 = new Gerente("Isabella", "000.000.000-00", 20000,"00000");
        Gerente gerente02 = new Gerente("Mateus", "111.111.111-11", 50000, "12345");

        Vendedor vendedor01 = new Vendedor("Fabricio", "222.222.222-22",1000, vendasFabricio, 10.0);
        Vendedor vendedor02 = new Vendedor("Murilo", "333.333.333-33", 15000, vendasMurilo, 12.0);
        Vendedor vendedor03 = new Vendedor("Joao", "444.444.444-44", 25000, vendasJoao, 15.0);
        Vendedor vendedor04 = new Vendedor("Amanda", "555.555.555-55", 20000, vendasAmanda, 12.0);
        Vendedor vendedor05 = new Vendedor("Pedro", "666.666.666-66", 15000, vendasPedro, 12.0);
        
        /* Armazenando nas listas   */
        for(int i=1; i <= 5; i++) {
            String nome = "funcionario0" + i;
            String cpf = "111.111.111-11";
            double salario = 1212 * i;
            
            Funcionario funcionario = new Funcionario(nome, cpf, salario);
            funcionarios.add(funcionario);
        }

        vendedores.add(vendedor01);
        vendedores.add(vendedor02);
        vendedores.add(vendedor03);
        vendedores.add(vendedor04);
        vendedores.add(vendedor05);

        gerentes.add(gerente01);
        gerentes.add(gerente02);
        
        /* Imprimindo Dados dos Funcionários e total de proventos de cada um */
        System.out.println("######################################################");
        for(Funcionario funcionario: funcionarios) {
            System.out.println("\n\n" + "DADOS DO FUNCIONÁRIO: ");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Total de Proventos: " + funcionario.calcularProventosAnuais() + "\n\n");
        }

        /* Aumentar salário em 10% */
        for(Funcionario funcionario: funcionarios) {
            double newSalary = funcionario.calcularSalario(10);
            funcionario.setSalario(newSalary);
        }

        System.out.println("#############----SALÁRIOS REMANEJADOS ------#########################################");
        for(Funcionario funcionario: funcionarios) {
            System.out.println("\n\n" + "DADOS DO FUNCIONÁRIO: ");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Total de Proventos: " + funcionario.calcularProventosAnuais() + "\n\n");
        }
        System.out.println("######################################################");


        
    }


}   
