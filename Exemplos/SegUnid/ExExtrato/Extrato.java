package Exemplos.SegUnid.ExExtrato;

import java.util.ArrayList;

public class Extrato {
    private double saldoFinal;
    private ArrayList <Float> transacoes;
    
    public Extrato() {
        this.saldoFinal = 0.0F;
        this.transacoes = new ArrayList<>();
    }

    public void trasacao(float valor){
        if (saldoFinal + valor < 0) {
            System.out.println("Saque nao realizado");
        } else {
            saldoFinal += valor;
            transacoes.add(valor);
        }
    }

    public void verExtrato(){
        System.out.println("==================");
        int numTransacao = 0;
        for (float transacao : transacoes) {
            System.out.println(++numTransacao);
        }
        System.out.println("Saldo Final: " + saldoFinal);
        System.out.println("==================");
    }
}
