package Lista.ClassesAbstratasPolimorfismoInterface.Q42;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca lb = new LivroDeBiblioteca("Calamidade Brutal", "Liko louco", 670, 1999, false, "4 fim do corredor", "A historia doentia de um lunatico em busca de governar o mundo e matar o Harry Potter");

        System.out.println(lb.estaEmprestado());
        lb.empresta();
        System.out.println(lb.estaEmprestado());
        //lb.devolve();

        System.out.println(lb.toString());
    }
}
