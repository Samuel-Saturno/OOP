package Lista.ReusoDeClasses.Q29;

public class DataHora {
    private int dd, mm, aa, hh;

    public DataHora(int hh, int dd, int mm, int aa) {
        this.hh = hh;
        this.dd = dd;
        this.mm = mm;
        this.aa = aa;
    }

    @Override
    public String toString() {
        return hh + "hr. " + dd + "/" + mm + "/" + aa;
    }
}
