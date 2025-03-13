package Lista.ReusoDeClasses.Q30;

public class LivroBiblioteca extends Livro {
    private int diasEmprestimo;

    public LivroBiblioteca(String autor, String titulo, int diasEmprestimo) {
        super(autor, titulo);
        this.diasEmprestimo = diasEmprestimo;
    }

    @Override
    public String toString() {
        return super.toString() + " Dias de emprestimo: " + diasEmprestimo;
    }
}
