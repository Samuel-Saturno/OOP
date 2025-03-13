package Exemplos.SegUnid.Reuso.ExEmpresa;

public class DemoEmpresa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Paulo Gustavo", "001");
        System.out.println(p);

        Funcionario f = new Funcionario("Ana Paula", "002", 4500.20F);
        System.out.println(f);

        ChefeDepartamento c = new ChefeDepartamento("Alex", "003", 15300.60F, "DETEC");
        System.out.println(c);
    }
}
