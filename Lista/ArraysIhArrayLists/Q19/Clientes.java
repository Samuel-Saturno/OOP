package Lista.ArraysArrayLists.Q19;

public class Clientes {
    private String nome;
    private int id, idade, telefone;

    public Clientes(int id , String nome , int idade, int telefone){
        this.nome = nome;
        this.id  = id;
        this.idade = idade;
        this.telefone = telefone;
    }

    public void impresora(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Telefone: " + telefone);
    }
}
