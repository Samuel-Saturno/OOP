package Lista.Q3;

public class AlunosUfersa {
    String matricula, nome;
    double prova1, prova2, trabalho;

    void inicializaAlunosUfersa(String m, String n, double p1, double p2, double t){
        matricula = m;
        nome = n;
        prova1 = p1;
        prova2 = p2;
        trabalho = t;
    }

    double mediaParcial(){
        return (2.5 * prova1 + 2.5 * prova2 + 2 * trabalho) / 7;
    }

    double provaFinal(){
        double mp1 = mediaParcial();
        if (mp1 > 3 && mp1 >= 7) {
            return 0;
        } else{
            return (50 - (mp1 * 6) / 7);
        }
    }

    double mediaFinal(){
        double mp2 = mediaParcial();
        double ef = provaFinal();
        if (ef == 0 || ef > 7.5) {
            return mp2;
        } else {
            return (mp2 * 6 + ef * 4) / 10;
        }
    }
    void imprimeAluno(){
        double mp3 = mediaParcial();
        System.out.println("Aluno: " + nome);
        System.out.println("Media Parcial: " + mp3);
        System.out.println("Prova Final: " + provaFinal());
        System.out.println("Media Final: " + mediaFinal());
        System.out.println("");
    }
}
