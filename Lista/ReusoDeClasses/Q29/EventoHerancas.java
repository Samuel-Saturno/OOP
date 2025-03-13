package Lista.ReusoDeClasses.Q29;

public class EventoHeranca extends EventoDelegacao {
    private String desc;

    public EventoHerança(int dd, int mm, int aa, int hh, String evento, String desc) {
        super(dd, mm, aa, hh, evento);
        this.desc = desc;
    }

    @Override
    public String toString() {
        return super.toString() + " Descricao: " + desc + "]";
    }
}
