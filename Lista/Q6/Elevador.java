package Lista.Q6;

import java.util.Scanner;

public class Elevador {
    private int andar, totalAndares, quantPessoas, capacidade, acao;

    public Elevador(int capacidade, int totalAndares){
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }

    private int entra(){
        if (quantPessoas < capacidade) {
            return quantPessoas++;
        } else{
            System.out.println("Elevador lotado");
            return quantPessoas;
        }
    }

    private int sai(){
        if (quantPessoas > 0) {
            return quantPessoas--;
        } else{
            System.out.println("Elevador vazio");
            return quantPessoas;
        }
    }

    private int sobe(){
        if (andar < totalAndares) {
            return andar++;
        } else{
            System.out.println("Ja atingiu o andar maximo");
            return andar;
        }
    }

    private int desce(){
        if (andar > 0) {
            return andar--;
        } else{
            System.out.println("Ja atingiu o terreo");
            return andar;
        }
    }

   private void mostraDados(){
    System.out.print(".-=== Elevador ===-.\n1- Entrar no elevador\n2- Sair do elevador\n3- Subir\n4- Descer\n(Para desativar o elevador escolha uma opcao invalida)\n\nEscolha uma opção: ");

   }

   public int menu(){
       Scanner sc = new Scanner(System.in);
       do {
           mostraDados();
           acao = sc.nextInt();
           System.out.println("");
            if (acao == 1) {
                entra();
            } else if (acao == 2) {
                sai();
            } else if (acao == 3) {
                sobe();
            } else if (acao == 4) {
                desce();
            }
       } while (acao == 1 || acao == 2 || acao == 3 || acao ==4);
       sc.close();

       return acao;
   }
}
