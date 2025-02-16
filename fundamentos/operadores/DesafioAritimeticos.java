package fundamentos.operadores;

public class DesafioAritimeticos {

    public static void main(String[] args) {


        int expressao1 = (6 * (3+2));
        double pow1 = Math.pow(expressao1, 2);

        double esquerdo = pow1/(3*2);

        System.out.println(esquerdo);

        int expressao2 = ((1-5) * (2-7))/2;
        double direito = Math.pow(expressao2, 2);

        System.out.println(direito);

        double expressao3 = esquerdo - direito;
        double pow2 = Math.pow(expressao3, 3);

        double pow3 = Math.pow(10,3);

        double resultado = pow2/pow3;

        System.out.println(resultado);


    }
}
