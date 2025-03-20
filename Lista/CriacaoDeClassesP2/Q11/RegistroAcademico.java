public class RegistroAcademico {
    private String nome;
    private String matricula;
    private int codigoCurso;
    private float percentualDeCobranca;
    private static int numeroMatriculas;

    public RegistroAcademico(String nome, String matricula, int codigoCurso, float percentualDeCobranca){
        this.nome = nome;
        this.matricula = matricula;
        this.codigoCurso = codigoCurso;
        this.percentualDeCobranca = percentualDeCobranca;
    }

    public void inicializaRegistroAcademico(){
        numeroMatriculas++;
        System.out.println("Nome: " + nome);
        System.out.println("Matricua: " + matricula);
        System.out.println("Codigo do Curso: " + codigoCurso);
        System.out.println("Percentual de Cobranca:: " + percentualDeCobranca);
        System.out.println("Numero de matriculas: " + numeroMatriculas);
    }

    public float calculaMensalidade(){
        return 100 * codigoCurso * percentualDeCobranca;
    }
}
