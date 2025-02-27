package Lista.CriaçãoDeClassesP2.Q9;

public class DemoRepresentanteComplexo {
    public static void main(String[] args) {
        RepresentanteComplexo rCom1 = new RepresentanteComplexo(2.0F, 3.0F, 1.0F);
        System.out.println(rCom1.toString());
        RepresentanteComplexo rCom2 = new RepresentanteComplexo(7.0F, 2.0F);
        System.out.println(rCom2.toString());
        RepresentanteComplexo rCom3 = new RepresentanteComplexo();
        System.out.println(rCom3.toString());
    }
}
