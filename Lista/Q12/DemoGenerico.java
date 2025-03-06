package Lista.CriaçãoDeClassesP2.Q12;

public class DemoGenerico {
    public static void main(String[] args) {
        Generico <Integer> g = new Generico<Integer>(2, 4, 2);
        g.impressora();
    }
}
