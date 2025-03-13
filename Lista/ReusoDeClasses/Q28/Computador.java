package Lista.ReusoDeClasses.Q28;

public class Computador extends Equipamento {
    private String marca, so;

    public Computador(int quant, boolean funciona, String marca, String so) {
        super(quant, funciona);
        this.marca = marca;
        this.so = so;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    @Override
    public String toString() {
        return super.toString() + " Computador [Marca: " + marca + ", SO: " + so + "]";
    }
}
