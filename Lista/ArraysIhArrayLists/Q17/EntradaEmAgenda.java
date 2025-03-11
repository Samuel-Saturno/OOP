package Lista.ArraysArrayLists.Q17;

public class EntradaEmAgenda {
    private int hora, dia, mes, ano;

    EntradaEmAgenda(int hora, int dia, int mes, int ano){
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString(){
        return "Hora: " + hora + "\nDia: " + dia + "\nMes: " + mes + "\nAno: " + ano;
    }

    public boolean ehNoDia(){
        if (this.hora == hora && this.dia == dia && this.mes == mes && this.ano == ano) {
            return true;
        } else {
            return false;
        }
    }
}
