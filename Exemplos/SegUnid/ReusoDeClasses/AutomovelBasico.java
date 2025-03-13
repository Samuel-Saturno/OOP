package Exemplos.SegUnid.Reuso.ExAutomovel;

public class AutomovelBasico extends Automovel {
    private boolean airbag, radio;

    public AutomovelBasico(int ano, String cor, String modelo, boolean airbag, boolean radio) {
        super(ano, cor, modelo);
        this.airbag = airbag;
        this.radio = radio;
    }

    public float quantoCusta(){
        float custo = super.quantoCusta();
        if (airbag) custo += 10000;
        if (radio) custo += 3000;

        return custo;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public boolean isRadio() {
        return radio;
    }
}
