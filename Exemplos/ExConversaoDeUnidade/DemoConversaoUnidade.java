package Exemplos.ExConversaoDeUnidade;

public class DemoConversaoUnidade {
    public static void main(String[] args) {
        System.out.println("3.5 polegadas = " + ConversaoUnidade.polegadasParaCentimetros(3.5F) + "centimetros");
        System.out.println("3.5 pes = " + ConversaoUnidade.pesParaCentimetros(3.5F) + "centimetros");
        System.out.println("3.5 milhas = " + ConversaoUnidade.milhasParaCentimetros(3.5F) + "centimetros");
    }
}
