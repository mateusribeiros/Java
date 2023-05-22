package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_01;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Pedro");
        Aluno aluno02 = new Aluno("André");

        Curso curso01 = new Curso("Programacao Orientada a Objetos","POO");
        Curso curso02 = new Curso("Inglês", "EN");


        aluno01.matricular(001,curso01, 2023);
        aluno02.matricular(002,curso02, 2023);
        
        System.out.println(aluno01);
        System.out.println(aluno02);
        
        curso01.setNome("Português");
        curso01.setSigla("PT");
        
        aluno02.setAno(2018);
        
        System.out.println(aluno01);
        System.out.println(aluno02);

    }
}
