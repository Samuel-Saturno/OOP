package Lista.CriaçãoDeClassesP2.Q12;

public class Generico <S> {
    private S pri, seg, ter;
    private int cont;

    Generico(S pri, S seg, S ter){
        this.pri = pri;
        this.seg = seg;
        this.ter = ter;
    }

    public int iguais(){
        if (pri.equals(seg)){
            cont++;
        } else if (pri.equals(ter)) {
            cont++;
        } else if (seg.equals(ter)) {
            cont++;
        }
        return cont;
    }

    public void impressora(){
        System.out.println("Atributos: " + pri + ", " + seg + ", " + ter);
        System.out.println("Numetros iguais: " + iguais());
    }
}
