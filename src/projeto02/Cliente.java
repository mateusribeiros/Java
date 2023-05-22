package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_02;

public class Cliente {
    private String nome;
    private String telefone;
    private int idade;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "Nome: " + nome + " - " + "Telefone: " + telefone + " - " + "Idade: " + idade;
    }
}
