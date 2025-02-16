package classe.desafio;

public class Jantar {

    public static void main(String[] args) {

        Comida c1 = new Comida("Feijão", 0.223);
        Comida c2 = new Comida("Arroz", 0.3);

        Pessoa p = new Pessoa("Pedro", 70.7);

        System.out.println(p.peso);

        p.comer(c2);

        System.out.println(p.peso);
    }
}
