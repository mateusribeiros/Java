package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_08;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    /* GETTERS E SETTERS */
    public void setHora(int hora) {
        if(validarHora(hora)) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora informada inválida!");
        }
    }

    public void setMinuto(int minuto) {
        if(validarMinuto(minuto)) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Minuto informado inválido!");
        }
    }

    public void setSegundo(int segundo) {
        if(validarSegundo(segundo)) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Segundo informado inválido!");
        }
    }

    public void setHorario(int hora, int minuto, int segundo){
        if(validarHora(hora) && validarMinuto(minuto) && validarSegundo(segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Hora, minuto ou segundo inválidos!");
        }
    }

    public int getHora() {
        return hora;
    }
    
    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public String getHorario() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    /* CONSTRUCTORS */
    public Horario(int hora) {
        this(hora, 0, 0);
    }

    public Horario(int hora, int minuto, int segundo) {
        if(validarHora(hora) && validarMinuto(minuto) && validarSegundo(segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Hora, minuto ou segundo inválidos!");
        }
    }

    /* MÉTODOS */ 
    public boolean validarHora(int hora) {
        return hora >= 0 && hora <= 23;
    }
 
    public boolean validarMinuto(int minuto) {
        return minuto >= 0 && minuto < 60;
    }

    public boolean validarSegundo(int segundo) {
        return segundo >= 0 && segundo < 60;
    }

    public static int diferenciarMinutos(Horario horario1, Horario horario2) {
        int totalMinutos1 = (horario1.getHora() * 60 + horario1.getMinuto());
        int totalMinutos2 = (horario2.getHora() * 60 + horario2.getMinuto());
        return Math.abs(totalMinutos1 - totalMinutos2);   
    }


}
