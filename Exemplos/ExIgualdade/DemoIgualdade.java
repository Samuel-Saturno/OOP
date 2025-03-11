package Exemplos.ExIgualdade;

public class DemoIgual {
    public static void main(String[] args) {
        if (Igual.ehIgual(2, 2)){
            System.out.println("Inteiros iguais");
        } else {
            System.out.println("Inteiros diferentes");
        }
        
        if (Igual.ehIgual(2.3, 2.3)){
            System.out.println("Doubles iguais");
        } else {
            System.out.println("Dloubles diferentes");
        }

        if (Igual.ehIgual("UFERSA", "UERN")){
            System.out.println("Strings iguais");
        } else {
            System.out.println("Strings diferentes");
        }
    }
}
