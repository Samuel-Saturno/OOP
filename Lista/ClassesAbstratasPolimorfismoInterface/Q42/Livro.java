package Lista.ClassesAbstratasPolimorfismoInterface.Q42;

public class Livro {
    private String titulo, autor;
    private int numeroDePaginas, anoDaEdicao;

    public Livro(String titulo, String autor, int numeroDePaginas, int anoDaEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDaEdicao = anoDaEdicao;
    }

    public String qualTitulo(){
        return titulo;
    }

    public String qualAutor(){
        return autor;
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + ", Autor: " + autor + ", Numero de paginas: " + numeroDePaginas + ", Ano: " + anoDaEdicao;
    }
}
