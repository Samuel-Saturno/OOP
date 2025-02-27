package Lista.CriaçãoDeClassesP2.Q8;

import java.util.Scanner;
import Lista.CriaçãoDeClassesP2.Q7.*;

public class Lampada {
    private boolean estadoDaLampada;
    private int controle;

    boolean acende(){
        contaAcender();
        return estadoDaLampada = true;
    }

    boolean apaga(){
        return estadoDaLampada = false;
    }

    void mostraEstado(){
        if (estadoDaLampada == true) {
            System.out.println("Lampada acesa");
        } else{
            System.out.println("Lampada apagada");
        }
    }

    boolean estaLigado(){
        if (estadoDaLampada == true) {
            return estadoDaLampada;
        } else {
            return estadoDaLampada;
        }
    }

    int contaAcender(){
        Contador cont = new Contador();
        return cont.incrementar();
    }

    void vezesAcesa(){
        Contador va = new Contador();
        va.imprimir();
    }

    private void mostraDados(){
        System.out.print(".-=== Lampada ===-.\n1- Acender\n2- Apagar\n3- Mostra Estado\n4- Vezes ligada\n(Para desativar o elevador escolha uma opcao invalida)\n\nEscolha uma opção: ");
    }

       public void menu(){
        Scanner sc = new Scanner(System.in);
        do {
            mostraDados();
            controle = sc.nextInt();
            System.out.println("");
            if (controle == 1) {
                acende();
            } else if (controle == 2) {
                apaga();
            } else if (controle == 3) {
                mostraEstado();
            } else if (controle == 4) {
                vezesAcesa();
            }
        } while (controle == 1 || controle == 2 || controle == 3 || controle == 4);
        sc.close();
    }
}
