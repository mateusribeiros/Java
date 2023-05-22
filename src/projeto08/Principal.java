package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_08;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("INSERIR O DADOS DO 1° Horário:");
        System.out.println("HORA: ");
        int hora = sc.nextInt();
        System.out.println("MINUTO: ");
        int minuto = sc.nextInt();
        System.out.println("SEGUNDO: ");
        int segundo = sc.nextInt();
        
        Horario horario1 = new Horario(hora, minuto, segundo);
        horario1.validarHora(hora);
        horario1.validarMinuto(minuto);
        horario1.validarSegundo(segundo);
        horario1.setHorario(hora, minuto, segundo);

        System.out.println(horario1.getHorario());
        
        System.out.println("--------------------------------------");
    
        System.out.println("INSERIR O DADOS DO 2° Horário:");
        System.out.println("HORA: ");
        hora = sc.nextInt();
        System.out.println("MINUTO: ");
        minuto = sc.nextInt();
        System.out.println("SEGUNDO: ");
        segundo = sc.nextInt();
        
        Horario horario2 = new Horario(hora, minuto, segundo);

        horario2.validarHora(hora);
        horario2.validarMinuto(minuto);
        horario2.validarSegundo(segundo);
        horario2.setHorario(hora, minuto, segundo);
        
        System.out.println(horario2.getHorario() + "\n");

        System.out.println("A diferença de minutos entre os horários é: " + Horario.diferenciarMinutos(horario1, horario2));
        
        sc.nextLine();
    }

}
