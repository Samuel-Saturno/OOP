package Exemplos.ExContaBancaria;

import java.text.NumberFormat.Style;
import java.util.Scanner;

public class DemoContaBancaria {
    public static void main(String[] args) {
        String nome;
        float saldo;

        //Entrada de dados
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Saldo: ");
        saldo = sc.nextFloat();
        sc.close();

        ContaBancaria c1 = new ContaBancaria("Italo");
        System.out.println(c1);
        ContaBancaria c2 = new ContaBancaria("Joao", 3567.87F, true);
        System.out.println(c2);
        ContaBancaria c3 = new ContaBancaria(nome, saldo, true);
        System.out.println(c3);
    }
}
