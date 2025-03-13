package Exemplos.SegUnid.Reuso.ExEmpresa;

public class Pessoa {
    private String nome, identidade;

    public Pessoa(String nome, String identidade) {
        this.nome = nome;
        this.identidade = identidade;
    }

    public String getNome() {
        return nome;
    }

    public String getIdentidade() {
        return identidade;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + ", Identidade = " + identidade;
    }

}
