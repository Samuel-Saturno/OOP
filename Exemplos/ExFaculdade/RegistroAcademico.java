package Exemplos.ExFaculdade;

public class RegistroAcademico {
    String nome;
    String matricula;
    int codigoCurso;
    float percentualDeCobranca;

    void inicializaRegistroAcademico(String n, String m, int c, float p){
        nome = n;
        matricula = m;
        codigoCurso = c;
        percentualDeCobranca = p;
    }

    float calculaMensalidade(){
        return 100 * codigoCurso * percentualDeCobranca;
    }
}
