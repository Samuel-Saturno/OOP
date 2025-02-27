package Exemplos.ExPessoa;

public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Pablo", 1.78F);
        p.setNome("Ana");
        p.setAltura(1.6F);
        System.out.println(p.toString());
    }
}
