package Lista.Q1;

public class DemoTime {
    public static void main(String[] args) {


        Time flamengo = new Time();
        flamengo.inicializaTime("Flamengo", "Felipe Luis", 28, 6, 4);

        Time santos = new Time();
        santos.inicializaTime("Santos", "Caixinha", 22, 8, 8);

        Time palmeiras = new Time();
        palmeiras.inicializaTime("Palmeiras", "Abel", 21, 11, 6);

        Time gremio = new Time();
        gremio.inicializaTime("Gremio", "Quinteiros", 19, 8, 11);

        int pontosF = flamengo.totalPontos();
        int pontosS = santos.totalPontos();
        int pontosP = palmeiras.totalPontos();
        int pontosG = gremio.totalPontos();

        int partidasF = flamengo.totalJogos();
        int partidasS = santos.totalJogos();
        int partidasP = palmeiras.totalJogos();
        int partidasG = gremio.totalJogos();

        System.out.println("=== Tabela ===");
        System.out.println("Flamento| J: " + partidasF + " | P: " + pontosF);
        System.out.println("Santos| J: " + partidasS + " | P: " + pontosS);
        System.out.println("Palmeiras| J: " + partidasP + " | P: " + pontosP);
        System.out.println("Gremio| J: " + partidasG + " | P: " + pontosG);
    }
}
