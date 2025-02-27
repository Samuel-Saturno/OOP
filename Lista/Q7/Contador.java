package Lista.CriaçãoDeClassesP2.Q7;

import java.util.Scanner;

public class Contador {
    private int valor, controle; //, aumenta, result;

    private int zerar(){
        return valor = 0;
    }

    private int incrementar(){
        if (valor < 0) {
            System.out.println("Valor invalido!");
            return valor;
        } else{
            return valor++;
        }

        // ERROR: Pesquisar e perguntar ao professor
        // Scanner scn = new Scanner(System.in);
        // System.out.print("Incrementar: ");
        // aumenta = scn.nextInt();
        // scn.close();

        // if (aumenta < 0) {
        //     System.out.println("Valor invalido!");
        //     return valor;
        // } else{
        //     result = valor + aumenta;
        //     return result;
        // }
    }
    private void imprimir(){
        System.out.println("Valor: " + valor);
    }

    private void mostraDados(){
        System.out.print(".-=== Evento ===-.\n1- Zerar\n2- Incrementar\n3- Imprimir\n(Para desativar o elevador escolha uma opcao invalida)\n\nEscolha uma opção: ");
       }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        do {
            mostraDados();
            controle = sc.nextInt();
            System.out.println("");
            if (controle == 1) {
                zerar();
            } else if (controle == 2) {
                incrementar();
            } else if (controle == 3) {
                imprimir();;
            }
        } while (controle == 1 || controle == 2 || controle == 3);
        sc.close();
    }
}
