package Exemplos.ExTriangulo;

public class Triangulo {
    double lado1, lado2, lado3;
    String desc;

    void inicializaTriangulo(double l1, double l2, double l3, String d){
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
        desc = d;
    }

    double perimetro(){
        return lado1 + lado2 + lado3;
    }
}
