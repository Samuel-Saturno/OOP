package Lista.ReusoDeClasses.Q29;

public class DemoEvento {
    public static void main(String[] args) {
        EventoHerança eh = new EventoHerança(11, 13, 3, 2025, "Almoco", "hora de comer");
        System.out.println(eh.toString());
        EventoDelegacao ed = new EventoDelegacao(16, 8, 4, 2025, "Jogo do Real");
        System.out.println(ed.toString());
        DataHora dh = new DataHora(15, 7, 12, 2004);
        System.out.println(dh.toString());
    }
}
