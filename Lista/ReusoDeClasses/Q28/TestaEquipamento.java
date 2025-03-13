package Lista.ReusoDeClasses.Q28;

public class TestaEquipamento {
    public static void main(String[] args) {
        Computador pc = new Computador(5, true, "Lenovo", "Ubuntu");
        System.out.println(pc.toString());
        Equipamento teclado = new Equipamento(20, true);
        System.out.println(teclado.toString());
    }
}
