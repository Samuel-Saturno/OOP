package Lista.ArraysArrayLists.Q19;

import java.util.Scanner;

public class DemoClientes {
    public static void main(String[] args) {

        Clientes[] cliente = new Clientes[10];
        int iD, i, t, contador = 0;
        String n;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Informe seu ID: ");
            iD = sc.nextInt();
            if (iD > 0) {
                System.out.print("Informe seu nome: ");
                n = sc.next();
                System.out.print("Informe sua Idade: ");
                i = sc.nextInt();
                System.out.print("Informe seu telefone: ");
                t = sc.nextInt();

                cliente[contador] = new Clientes(iD, n, i, t);
                contador++;
            }
        } while (iD > 0);

        sc.close();

        for (int j = 0; j < contador; j++) {
            cliente[j].impresora();
        }
    }
}
