public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico("Michael", "12345678", 2, 0.6F);
        michael.inicializaRegistroAcademico();
        float mensal = michael.calculaMensalidade();
        System.out.println("Mensalidade de Michael: " + mensal);
    }
}
