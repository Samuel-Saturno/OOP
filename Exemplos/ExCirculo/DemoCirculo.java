package Exemplos.ExCirculo;

public class DemoCirculo {
    public static void main(String[] args) {
        System.out.println("PI: " + Circulo.pi);
        Circulo circ1 = new Circulo(1.0);
        System.out.println("Perimetro circulo 1: " + circ1.perimetro());
        Circulo circ2 = new Circulo(2.0);
        System.out.println("Perimetro circulo 2: " + circ2.perimetro());
    }
}
