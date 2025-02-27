package Exemplos.ExDatra;

public class DemoData {
    public static void main(String[] args) {
        Data d1 = new Data (-1, -1, -5);
        d1.mostraData();

        Data d2 = Data.criaNatal(2022);
        d2.mostraData();
        Data d3 = Data.criaNatal(0);
        if (d3!=null) d3.mostraData();
        Data d4 = Data.criaData(-2, -1, -2);
        if(d4!=null) d4.mostraData();
    }
}
