package Exemplos.ExDatra;

public class Data {
    private int dia, ano, mes;

    

    public Data(int dia, int ano, int mes) {
        this.dia = dia;
        this.ano = ano;
        this.mes = mes;

        if (!dataEhValida()) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    //ele n vai receber nenhum argumento pq os argumentos (data, mes e ano) ja estao na classe
    boolean dataEhValida(){
        return (dia>=1 && dia<=31 && mes>=1 && mes<=12 && ano>=0);
    }
    
    public void inicializaData(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
        if (!dataEhValida()) {
            dia = 1;
            mes = 1;
            ano = 2000;
        }
    }

    public void mostraData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    static Data criaNatal(int ano){
        if (ano > 0) {
            return new Data(25, 12, ano);
        } else{
            System.out.println("Ano invalido!");
            return null;
        }
    }

    static Data criaData(int dia, int mes, int ano){
        if (dia>=1 && dia<=31 && mes>=1 && mes<=12 && ano>=0) {
            return new Data(dia , mes, ano);
        } else{
            System.out.println("Ano invalido!");
            return null;
        }
    }

}
