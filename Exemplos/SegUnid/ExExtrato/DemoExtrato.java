package Exemplos.SegUnid.ExExtrato;

import java.util.Scanner;

public class DemoExtrato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Extrato extrato = new Extrato();
        int opcao;
        float valor;
        boolean terminar = false;

        do {
            System.out.println("0- Depositar");
            System.out.println("1- Sacar");
            System.out.println("2- Ver extrato");
            System.out.println("3- Encerrar");
            System.out.println("Opcao: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 0:
                    System.out.println("Valor : ");
                    valor = sc.nextFloat();
                    extrato.trasacao(valor);
                break;

                case 1:
                    System.out.println("Valor : ");
                    valor = sc.nextFloat();
                    extrato.trasacao(-valor);
                break;

                case 2:
                    extrato.verExtrato();
                break;

                default:
                    System.out.println("Encerrando Sessao...");
                    terminar = true;
                break;
            }
        } while (!terminar);

        sc.close();
    }
}
