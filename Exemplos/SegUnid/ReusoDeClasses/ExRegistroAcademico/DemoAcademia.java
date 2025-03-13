package Exemplos.SegUnid.Reuso.ExRegistroAcademico;

public class DemoAcademia {
    public static void main(String[] args) {
        RegistroAcademicoPosGraduacao reg1 = new RegistroAcademicoPosGraduacao("Maria Paula", "0001", "BTI", "Moteres e Antenas", "Segundo");
        System.out.println(reg1);

        RegistroAcademicoPosGraduacao regGrad = new RegistroAcademicoPosGraduacao("Luan Jesus", "0002", "Engenharia", "SIGAA", "Ferdinandy");
        System.out.println(regGrad);
    }
}
