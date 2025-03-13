package Lista.ReusoDeClasses.Q31;

public class DemoPolitico {
    public static void main(String[] args) {
        Governador governador = new Governador("Nogueira", 21, "PCdoB", "RN");
        System.out.println(governador.toString());

        Prefeito prefeito = new Prefeito("Paxica", 99, "PT", "Coronel Joao Pessoa");
        System.out.println(prefeito.toString());
    }
}
