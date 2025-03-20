package Lista.ClassesAbstratasPolimorfismoInterface.Q42;

public class LivroDeBiblioteca extends Livro {
    private boolean emprestimo;
    private String prateleira, desc;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao, boolean emprestimo, String prateleira, String desc) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.emprestimo = emprestimo;
        this.prateleira = prateleira;
        this.desc = desc;
    }

    public boolean estaEmprestado(){
        return emprestimo;
    }
    public boolean empresta(){
        emprestimo = true;
        return emprestimo;
    }
    public boolean devolve(){
        emprestimo = false;
        return emprestimo;
    }
    public String localizacao(){
        return prateleira;
    }
    public String descricao(){
        return desc;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDisponibilidade: " + (emprestimo ? "Nao" : "Sim") + ", Prateleira: " + prateleira + ", Descricao: " + desc;
    }
}
