package Lista.ReusoDeClasses.Q30;

public class DemoLivro {
    public static void main(String[] args) {
        LivroLivraria ll = new LivroLivraria("Kleber", "A minha batalha", 12.45F);
        System.out.println(ll.toString());
        LivroBiblioteca lb = new LivroBiblioteca("Chico Pitomba", "Comedia do Nordeste", 36);
        System.out.println(lb.toString());
    }
}
