package Lista.Q1;

public class Time {
    String clube, tecnico;
    int vitorias, derrotas, empates;

    void inicializaTime(String cl, String tec, int v, int e, int d){
        clube = cl;
        tecnico = tec;
        vitorias = v;
        empates = e;
        derrotas = d;
    }

    int totalPontos(){
        return 3 * vitorias + empates;
    }

    int totalJogos(){
        return vitorias + empates + derrotas;
    }
}
