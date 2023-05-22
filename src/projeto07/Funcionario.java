package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_07;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularBonificacao() {
        return (salario * 0.1) * 2;
    }

    public double calcularSalario(double percent) {
        double bonif = (salario * (percent / 100));
        return salario + bonif;
    }

    public double calcularProventosAnuais() {
        return ( (salario + calcularBonificacao()) * 12);
    }
}
