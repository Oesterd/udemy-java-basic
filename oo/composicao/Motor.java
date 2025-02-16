package oo.composicao;

public class Motor {

    Carro carro;
    String nome;
    boolean ligado = false;
    double fatorInjecao = 1;

    Motor(Carro carro) {
        this.carro = carro;
    }

    public Motor() {
    }

    int giros() {
        if(!ligado) {
            return 0;
        } else {
        return (int) Math.round(fatorInjecao * 3000);
        }
    }
}
