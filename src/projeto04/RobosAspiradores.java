package ufg.Programacao_Orientada_a_Objetos.laboratorios.lista_01.exercicio_04;

public class RobosAspiradores {
    private int id;
    private String status; /** ligado, andando, parado e desligado */
    private int posicaoX;
    private int posicaoY; /* Não compreendi como deseja o encapsulamento na Classe */
    private int quantPo;
    private int limitePo;
    
    /* CONSTRUCTORS */
    public RobosAspiradores(int limitePo) {
        this.status = "Desligado";
        this.posicaoX = 0;
        this.posicaoY = 0;
        this.quantPo = 0;
        this.limitePo = limitePo; 
    }


    /* GETTERS E SETTERS */
    public int getId() {
        return id;
    }
    public int getLimitePo() {
        return limitePo;
    }
    public int getPosicaoX() {
        return posicaoX;
    }
    public int getPosicaoY() {
        return posicaoY;
    }
    public int getQuantPo() {
        return quantPo;
    }
    public String getStatus() {
        return status;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public void setLimitePo(int limitePo) {
        this.limitePo = limitePo;
    }
    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }
    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }
    public void setQuantPo(int quantPo) {
        this.quantPo = quantPo;
    }
    public void setStatus(String status) {
        this.status = status;
    }


    /* MÉTODOS */
    public void ligar() {
        this.status = "Ligado";
        System.out.println(toString());
        System.out.println("Ligado");
    }
    
    public void desligar() {
        this.status = "Desligado";
        System.out.println(toString());
        System.out.println("Desligado");
    }
    
    public void aspirar(int quantPo) {
        if(this.status == "Desligado") {
            System.out.println("Aspirador Desligado, impossível executar a ação");
        } else {
            this.quantPo += quantPo;
            if(this.quantPo >= limitePo) {
                System.out.println("O limite de pó do Aspirador foi atingido!!!!!!!!!");
                System.out.println("Limite de Pó: " + limitePo + "Quantidade de pó a ser aspirado: " + this.quantPo);
                System.out.println("DESLIGANDO....");
                desligar();
            }
        }
        System.out.println(toString());
    }
    
    public void andar(int andarX, int andarY) {
        if(this.status != "Desligado") {
            this.posicaoX += andarX;
            this.posicaoY += andarY;
            this.status = "Andando";
            System.out.println("Andando...");
        } else {
            System.out.println("Aspirador Desligado, impossível executar a ação");
        }
        System.out.println(toString());
    }
    
    public void parar() {
        if(this.status != "Desligado") {
            this.status = "Parado";
            System.out.println("Parando...");
        } else {
            System.out.println("Aspirador Desligado, impossível executar a ação");
        }
        System.out.println(toString());
    }

    public String toString() {
        return "Identificação: " + id + " Status: " + status + " Posição X: " + posicaoX + " Posição Y: " + posicaoY + " Quantidade de Pó: " + quantPo + " Limite de Pó: " + limitePo;
    }


}
