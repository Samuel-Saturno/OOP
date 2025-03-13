package Exemplos.SegUnid.Reuso.ExRegistroAcademico;

public class RegistroAcademico {
    private String nomeDoAluno, matricula, curso;

    public RegistroAcademico(String nomeDoAluno, String matricula, String curso) {
        this.nomeDoAluno = nomeDoAluno;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String toString(){
        return "Nome: " + nomeDoAluno + "; Matricula: " + matricula + "; Curso: " + curso;
    }
}
