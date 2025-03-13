package Exemplos.SegUnid.Reuso.ExRegistroAcademico;

public class RegistroAcademicoPosGraduacao {
    private RegistroAcademico registro;
    private String tituloTese, orientador;

    // Passando o objeto construido fora do construtor
    public RegistroAcademicoPosGraduacao(RegistroAcademico registro, String tituloTese, String orientador) {
        this.registro = registro;
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    // Construindo objeto dentro do construtor
    public RegistroAcademicoPosGraduacao(String nomeDoAluno, String matricula, String curso, String tituloTese, String orientador) {
        this.registro = new RegistroAcademico(nomeDoAluno, matricula, curso);
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    public String toString(){
        return registro + "; Titulo da tese: " + tituloTese + "; Orientador: " + orientador;
    }
}
