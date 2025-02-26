package Exemplos.ExFaculdade;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();
        michael.inicializaRegistroAcademico("Michael", "12345678", 2, 0.6F);
        
        float mensal = michael.calculaMensalidade();
        System.out.println("Mensalidade = " + mensal);
    }
}
