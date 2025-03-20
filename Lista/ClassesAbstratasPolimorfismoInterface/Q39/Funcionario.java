package Lista.ClassesAbstratasPolimorfismo_nterface.Q39;

public class Funcionario {
    private String nome;
    private float salario;
    private int horas;

    public Funcionario(String nome) {
        this.nome = nome;
        this. salario = 2.00F;
        this.horas = 8;
    }

    public Funcionario(String nome, float salario, int horas) {
        this.nome = nome;
        this.salario = salario;
        this.horas = horas;
    }

    public float pagamento(){
        return salario * horas;
    }

    @Override
    public String toString() {
        return "Funcionario [Nome: " + nome + ", Salario (hrs): " + salario + ", Pagamento: " + pagamento() + "]";
    }
}
