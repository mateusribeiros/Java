package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_03;

public class Televisao {
    private int volume;
    private int canal;

    public Televisao() {
        this.volume = 0;
        this.canal = 0;
    }

    public int getVolume() {
        return volume;
    }

    public int getcanal() {
        return canal;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void setcanal(int canal) {
        this.canal = canal;
    }

    public void aumentarVolume() {
        this.volume += 1;
    }

    public void diminuirVolume() {
        this.volume -= 1;
    }

    public void trocarCanal(int canal) {
        this.canal = canal;
    }

    public String toString() {
        return "Canal: " + canal + ", " + "Volume: " + ", " + volume; 
    }
}
