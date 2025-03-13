package Lista.ArraysArrayLists.Q21;

import java.util.Random;;

public class DoisDados {
    public static void main(String[] args) {
        int numLancamentos = 36000000;
        int[] contagem = new int[13];
        Random random = new Random();

        for (int i = 0; i < numLancamentos; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int soma = dado1 + dado2;
            contagem[soma]++;
        }

        System.out.println(" Numero     |     Frequencia ");
        System.out.println("-----------------------------");
        for (int i = 2; i <= 12; i++) {
        System.out.println(i + "     |     " + contagem[i]);
        }
    }
}
