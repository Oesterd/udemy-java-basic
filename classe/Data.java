package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    public String dataFormatada () {
        return "%d/%d/%d".formatted(dia, mes, ano);
    }

    Data () {
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        this(1,1,1970);
    }

    Data (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

}
