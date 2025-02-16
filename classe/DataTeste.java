package classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data();

        System.out.println(d1.dataFormatada());

        Data d2 = new Data(12, 06, 1992);

        System.out.println(d2.dataFormatada());
    }



}
