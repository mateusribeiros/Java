package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_03;
import java.util.Scanner;

public class ControleRemoto {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        System.out.println(tv);
        
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um novo canal: ");
        int newChannel = sc.nextInt();

        tv.trocarCanal(newChannel);
        System.out.println(tv);

    }
}
