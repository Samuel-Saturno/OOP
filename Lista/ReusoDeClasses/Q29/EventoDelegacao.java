package Lista.ReusoDeClasses.Q29;

public class EventoDelegacao extends DataHora {
    private String evento;

    public EventoDelegacao(int dd, int mm, int aa, int hh, String evento) {
        super(dd, mm, aa, hh);
        this.evento = evento;
    }

    @Override
    public String toString() {
        return super.toString() + " | Evento: " + evento;
    }
}
