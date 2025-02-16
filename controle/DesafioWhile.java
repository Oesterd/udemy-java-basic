package controle;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double total = 0;
        double nota = 0;
        int notasValidas = 0;


        while(nota != -1) {
            System.out.println("Digite uma nota válida ou -1 para sair ");
            nota = entrada.nextDouble();
            if (nota <= 10 && nota>= 0) {
                total += nota;
                notasValidas++;
            } else {

            }
        }

        double media = total/notasValidas;
        System.out.println("Média: " + media);
    }
}
