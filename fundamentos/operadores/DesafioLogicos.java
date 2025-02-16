package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean tomouSorvete = trabalho1 || trabalho2;
        boolean ficouEmCasa = !trabalho1 && !trabalho2;

        System.out.println("Comprou TV 50\"? " + comprouTv50);
        System.out.println("Comprou TV 32\"? " + comprouTv32);
        System.out.println("Tomou sorvete? " + tomouSorvete);
        System.out.println("Ficou em casa? " + ficouEmCasa);


    }
}
