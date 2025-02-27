package Exemplos.ExData;

public class Data {
    int dia, ano, mes;

    //ele n vai receber nenhum argumento pq os argumentos (data, mes e ano) ja estao na classe
    boolean dataEhValida(){
        return (dia>=1 && dia<=31 && mes>=1 && mes<=12 && ano>=0);
    }
    
    void inicializaData(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;;
    }

    void mostraData(){
        //System.out.println("Dia: "+dia);
        //System.out.println("Mes: "+mes);
        //System.out.println("Ano: "+ano);
        System.out.println(dia + "/" + mes + "/" + ano);
    }

}
