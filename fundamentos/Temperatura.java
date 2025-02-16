package fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        final int AJUSTE = 32;
        final double FATOR = 5/9.0;
        double TempFarenheit = 0;

        double TempCelcius = (TempFarenheit - AJUSTE) * FATOR;

        System.out.println("A temperatura em Celsius é: " + TempCelcius + "ºC");

    }
}
