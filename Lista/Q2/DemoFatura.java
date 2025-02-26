package Lista.Q2;

public class DemoFatura {
    public static void main(String[] args) {
        Fatura teclado = new Fatura();
        teclado.inicializaFatura("Teclado", "001", 23, 45.99F);

        Fatura mouse = new Fatura();
        mouse.inicializaFatura("Mouse", "002", -2, 14.99F);

        Fatura monitor = new Fatura();
        monitor.inicializaFatura("Monitor", "003", -5, -10.2F);

        int qntTeclado = teclado.validacaoQuantidade();
        int qntMouse = mouse.validacaoQuantidade();
        int qntMonitor = monitor.validacaoQuantidade();
        float prcTeclado = teclado.validacaoPreco();
        float prcMouse = mouse.validacaoPreco();
        float prcMonitor = monitor.validacaoPreco();

        float faturaTeclado = qntTeclado * prcTeclado;
        float faturaMouse = qntMouse * prcMouse;
        float faturaMonitor = qntMonitor * prcMonitor;

        System.out.println("===== Gerenciamento =====");
        System.out.println("Teclado / Estoque: " + qntTeclado + "/" + "Preco: " + prcTeclado);
        System.out.println("Mouse / Estoque: " + qntMouse + "/" + "Preco: " + prcMouse);
        System.out.println("Monitor / Estoque: " + qntMonitor + "/" + "Preco: " + prcMonitor);
        System.out.println("===== Fatura =====");
        System.out.println("Teclado: " + faturaTeclado);
        System.out.println("Mouse: " + faturaMouse);
        System.out.println("Monitor: " + faturaMonitor);
    }
}
