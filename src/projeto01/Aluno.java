package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_01;

public class Aluno {
	private String nome;
	private int matricula;
	private int ano;
	private Curso curso;
	
	Aluno (String nome) {
		this.nome = nome;
	}
	
	public void matricular (int matricula, Curso curso, int ano) {
		this.matricula = matricula;
		this.ano = ano;
		this.curso = curso;
	}
	
	public String toString() {
		return "Aluno : "+ nome + " - matricula : " + matricula + " - " + curso + " - " + ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}

}
