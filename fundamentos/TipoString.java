package fundamentos;

import java.util.Arrays;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(4));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.equals("Boa tarde"));
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome +"\n\n");

        System.out.printf("O senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);

        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".substring(6,10));
    }
}
