package Exemplos.SegUnid.Reuso.ExAutomovel;

public class AutomovelDeLuxo extends AutomovelBasico {
    private boolean arCondicionado, direcaoHidraulica;

    public AutomovelDeLuxo(int ano, String cor, String modelo, boolean airbag, boolean radio, boolean arCondicionado,
            boolean direcaoHidraulica) {
        super(ano, cor, modelo, airbag, radio);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public float quantoCusta(){
        float custo = super.quantoCusta();
        if (arCondicionado) custo += 15000;
        if (direcaoHidraulica) custo += 17000;
        return custo;
    }

    @Override
    public String toString() {
        String res = "Ano: " + super.getAno() + ", Cor: " + super.getCor() + ", Modelo: " + getModelo() + ", AirBag: " + (isAirbag() ? "sim" : "nao") + ", Radio: " + (isRadio() ? "sim" : "nao") + ", ArCondicionado: " + (arCondicionado ? "sim" : "nao") + ", DirecaoHidraulica: " + (direcaoHidraulica ? "sim" : "nao");
        return res;
    }
}
