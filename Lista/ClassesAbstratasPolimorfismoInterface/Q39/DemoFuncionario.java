package Lista.ClassesAbstratasPolimorfismo_nterface.Q39;

public class DemoFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Kaleb");
        System.out.println(f1.toString());
        Funcionario f2 = new Funcionario("Gata", 12.30F, 6);
        System.out.println(f2.toString());
    }
}
