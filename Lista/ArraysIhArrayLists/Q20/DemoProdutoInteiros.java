package Lista.ArraysArrayLists.Q20;

import java.util.Scanner;

public class DemoProdutoInteiros {
    public static void main(String[] args) {
        ProdutoInteiros pi = new ProdutoInteiros();
        int valor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Para encerrar digite um numero < 0");
        do {
            System.out.print("Digite um numero: ");
            valor = sc.nextInt();
            
            if (valor > 0) {
                pi.produtos(valor);
            }
        } while (valor > 0);

        System.out.println("Produto: " + pi.produtos(valor));

        sc.close();
    }
}
