package Lista.Q3;

public class DemoAlunosUfersa {
    public static void main(String[] args) {
        AlunosUfersa leticia = new AlunosUfersa();
        leticia.inicializaAlunosUfersa("001", "Leticia", 10.0, 10.0, 10.0);

        AlunosUfersa daniel = new AlunosUfersa();
        daniel.inicializaAlunosUfersa("002", "Daniel", 7.8, 8.5, 9.3);

        AlunosUfersa isabelly = new AlunosUfersa();
        isabelly.inicializaAlunosUfersa("003", "Isabelly", 7.9, 8.1, 9.3);

        AlunosUfersa burro = new AlunosUfersa();
        burro.inicializaAlunosUfersa("004", "Burrino", 1.5, 3.8, 4.1);

        AlunosUfersa samuel = new AlunosUfersa();
        samuel.inicializaAlunosUfersa("005", "Samuel", 5.7, 8.9, 9.8);

        AlunosUfersa jumento = new AlunosUfersa();
        jumento.inicializaAlunosUfersa("006", "Jegue", 0, 1.2, 0.9);

        leticia.imprimeAluno();
        daniel.imprimeAluno();
        isabelly.imprimeAluno();
        burro.imprimeAluno();
        samuel.imprimeAluno();
        jumento.imprimeAluno();
    }
}
