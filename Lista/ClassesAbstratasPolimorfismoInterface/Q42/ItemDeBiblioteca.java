package Lista.ClassesAbstratasPolimorfismoInterface.Q42;

public interface ItemDeBiblioteca {
    public final int maximoDeDiasParaEmprestimo = 14;

    public abstract boolean estaEmprestado();
    public abstract boolean empresta();
    public abstract boolean devolve();
    public abstract String localizacao();
    public abstract String descricao();

}
