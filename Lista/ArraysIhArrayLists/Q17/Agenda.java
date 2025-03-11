package Lista.ArraysArrayLists.Q17;

import Lista.ArraysArrayLists.Q17.EntradaEmAgenda;

public class Agenda {
    private EntradaEmAgenda[] horarios;
    private static int tamanho = 5;
    private int quant = -1;

    public Agenda(){
        this.horarios = new EntradaEmAgenda[tamanho];
    }

    public EntradaEmAgenda novoCompromisso(int hora, int dia, int mes, int ano){
        if (tamanho == quant) {
            tamanho = tamanho * 2;
        }

        quant++;
        return horarios[quant] = new EntradaEmAgenda(hora, dia, mes, ano);
    }

    public void listaDia(){
        for (int i = 0; i < quant+ 1; i++) {
            System.out.println(horarios[i].toString() + "\n");
        }
    }
}
