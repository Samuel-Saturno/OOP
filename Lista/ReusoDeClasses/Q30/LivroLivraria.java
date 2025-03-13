package Lista.ReusoDeClasses.Q30;

public class LivroLivraria extends Livro {
    private float preco;

    public LivroLivraria(String autor, String titulo, float preco) {
        super(autor, titulo);
        this.preco = preco;
    }

    @Override
    public String toString() {
        return super.toString() + " Preco: " + preco;
    }
}
