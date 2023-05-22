package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_07;

public class Gerente extends Funcionario{
    private String senha;

    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double calcularBonificacao() {
        return salario * 0.15;
    }
}
