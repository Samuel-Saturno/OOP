package Exemplos.SegUnid.Reuso.ExAutomovel;

public class Automovel {
    private int ano;
    private String cor, modelo;
    public Automovel(int ano, String cor, String modelo) {
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
    }

    public float quantoCusta(){
        return (ano < 2010 ? 60000 : 90000);
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }
}
