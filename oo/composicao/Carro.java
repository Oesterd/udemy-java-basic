package oo.composicao;

public class Carro {

    Motor motor;

    String nome;


    public Carro() {
    }

    Carro(String nome) {
        Carro outroCarro = new Carro();
        outroCarro.nome = "lamb";
        motor = new Motor(this);
        this.nome = nome;
        motor.nome = "Eu sou o motor do: " + motor.carro.nome;
    }

    void acelerar() {
        if(motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4;
        }
    }

    void frear() {
        if(motor.fatorInjecao > 0.5) {
        motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }
}
