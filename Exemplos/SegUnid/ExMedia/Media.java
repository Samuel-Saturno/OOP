package Exemplos.SegUnid.ExMedia;

public class Media {
    public static void main(String[] args) {
        System.out.println(media(1.5, 2.0));
        System.out.println(media(3.5, 2.0));
        System.out.println(media(5.7, 2.0));
        System.out.println(media(2.1, 2.0));
        System.out.println(media(6.9, 2.0));
    }

    public static double media(double... numeros){
        double soma = 0;
        for (double d : numeros) {
            soma += d;
        }
        double media = soma / numeros.length;
        return media;
    }
}
