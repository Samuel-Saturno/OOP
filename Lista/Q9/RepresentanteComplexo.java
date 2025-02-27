package Lista.CriaçãoDeClassesP2.Q9;

public class RepresentanteComplexo {
    private float realA, realB, imaginario;

    public RepresentanteComplexo(float realA, float realB, float imaginario) {
        this.realA = realA;
        this.realB = realB;
        this.imaginario = imaginario;
    }

    public RepresentanteComplexo(float realA, float realB) {
        this.realA = realA;
        this.realB = realB;
        this.imaginario = 0.0F;

    }

    public RepresentanteComplexo() {
        this.imaginario = 0.0F;
        this.realA = 0.0F;
        this.realB = 0.0F;
    }

    public String toString() {
        float res = realA + (realB * imaginario);
        return (realA + " + " + realB + " * " + imaginario + " = " + res);
    }
}
