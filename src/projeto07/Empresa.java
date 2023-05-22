package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_07;
import java.util.ArrayList;

public class Empresa {
    private String cnpj;
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getCnpj() {
        return cnpj;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void AddFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void mostrarFuncionarios() {
        System.out.println("Lista de Funcionários da Empresa:");
        for(Funcionario funcionario: funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("-----------------------------------------");
        }
    }
}
