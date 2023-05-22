package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_04;

public class Principal {
    public static void main(String[] args) {
        RobosAspiradores robo1 = new RobosAspiradores(100);
        RobosAspiradores robo2 = new RobosAspiradores(200);

        robo1.ligar();
        robo2.desligar();

        robo1.andar(15, 25);
        robo1.parar();

        robo2.aspirar(25);
    }
}
