package arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas você quer informar?");

        double[] notas = new double[entrada.nextInt()];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i+1));
            notas[i] = entrada.nextDouble();
        }


        double total = 0;

        for(double nota: notas) {
            total += nota;
        }

        System.out.println("A média é " + total / notas.length);
    }
}
