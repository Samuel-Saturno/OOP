package Lista.ReusoDeClasses.Q28;

public class Equipamento {
    private int quant;
    private boolean funciona;

    public Equipamento(int quant, boolean funciona) {
        this.quant = quant;
        this.funciona = funciona;
    }

    public int getQuant() {
        return quant;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }
    public boolean isFunciona() {
        return funciona;
    }
    public void setFunciona(boolean funciona) {
        this.funciona = funciona;
    }
    @Override
    public String toString() {
        return "Equipamento [Quantidade: " + quant + ", Status: " + (funciona ? "funciona" : "quebrado") + "]";
    }
}
