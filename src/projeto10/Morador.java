package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_10;

public class Morador {
    private static int codigoSequencial = 1;

    private String nome;
    private String cpf;
    private String celular;
    private String dataNascimento;
    private String sexo;
    private String bloco;
    private String apartamento;
    private String codigoAcesso;
    private int codigo;

    public Morador(String nome, String cpf, String celular, String dataNascimento, String sexo, String bloco, String apartamento, String codigoAcesso) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.bloco = bloco;
        this.apartamento = apartamento;
        this.codigoAcesso = codigoAcesso;
        this.codigo = codigoSequencial++;
    }

    public void mostrarDados() {
        System.out.println("-----------------------------");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Celular: " + celular);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Bloco: " + bloco);
        System.out.println("Apartamento: " + apartamento);
        System.out.println("Código de Acesso: " + codigoAcesso);
        System.out.println();
    }
}
