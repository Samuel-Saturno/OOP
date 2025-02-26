package Exemplos.ExTriangulo;

public class DemoTriangulo {
    public static void main(String[] args) {
        Triangulo t1, t2, t3;
        
        t1 = new Triangulo();
        t1.inicializaTriangulo(3, 4, 5, "triangulo retangulo");

        t2 = new Triangulo();
        t2.inicializaTriangulo(3, 4, 5, "triangulo retangulo");

        t3 = t1;

        //System.out.println(t1 + " " + t2 + " " + t3 + " ");
        //System.out.println(t1 == t2); //false
        //System.out.println(t1 == t3); //true
    }
}
