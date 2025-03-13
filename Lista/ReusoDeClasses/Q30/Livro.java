package Lista.ReusoDeClasses.Q30;

public class Livro {
    private String autor, titulo;

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Autor: " + autor + " Titulo: " + titulo;
    }
}
