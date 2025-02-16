package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    private int delta = 5;

    Carro () {
        this(210);
    }

    public Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

   public void acelerar() {
        if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
        velocidadeAtual += getDelta();
        }
    }

    public void frear() {
        if(velocidadeAtual > 0) {
        velocidadeAtual -= 5;
        }
    }

    @Override
    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + " Km/h.";
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
