package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_07;

public class Vendedor extends Funcionario {
    private int[] totalVendas;
    private double comissao;
    
    public Vendedor(String nome, String cpf, double salario, int[] totalVendas, double comissao) {
        super(nome, cpf, salario);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    public int[] getTotalVendas() {
        return totalVendas;
    }
    public double getComissao() {
        return comissao;
    }

    public void setTotalVendas(int[] totalVendas) {
        this.totalVendas = totalVendas;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calcularBonificacao() {
        return (getSalario() * 0.1) * 2;
    }
    
    public double calcularSalario(double percent) {
        double bonif = (getSalario() * (percent / 100));
        return getSalario() + bonif;
    }
    

    public double calcularProventosAnuais() {
        double totalComissao = 0;
        for (int venda : totalVendas) {
            totalComissao += (venda * comissao) / 100;
        }
        return (getSalario() + calcularBonificacao() + totalComissao) * 12;
    }
}
