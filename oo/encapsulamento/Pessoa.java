package oo.encapsulamento;

public class Pessoa {

    private int idade;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade) {
        setIdade(idade);
        setNome(nome);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120) {
        this.idade = novaIdade;
        }
    }

    @Override
    public String toString() {
            return "Olá eu sou o " + getNome() + " e tenho " + getIdade() + " anos.";
    }
}
