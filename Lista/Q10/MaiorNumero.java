package Lista.CriaçãoDeClassesP2.Q10;

public class MaiorNumero {
    private int a, b, c;
    private double d, e;
    
    public MaiorNumero(int a, int b, int c, double d, double e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public MaiorNumero(int a, int b, double d, double e) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
    }

    public MaiorNumero(int a, int b, double d) {
        this.a = a;
        this.b = b;
        this.d = d;
    }

    public MaiorNumero(int a, double d) {
        this.a = a;
        this.d = d;
    }
}
