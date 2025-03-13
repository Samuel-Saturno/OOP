package Exemplos.SegUnid.Reuso.ExAutomovel;

public class DemoAutomoveis {
    public static void main(String[] args) {
        AutomovelDeLuxo carro = new AutomovelDeLuxo(2024, "vermelho", "Ferrari", true, true, true, true);
        System.out.println(carro.toString());
        System.out.println(carro.quantoCusta());
    }
}
