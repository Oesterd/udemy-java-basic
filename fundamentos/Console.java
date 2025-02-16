package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salário %.1f", 1234.5678);

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("\nDigite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("\nDigite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

        entrada.close();
    }
}
