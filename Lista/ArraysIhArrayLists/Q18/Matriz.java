package Lista.ArraysArrayLists.Q18;

public class Matriz {
    private float[][] matriz;
    private static final int LINHAS = 2, COLUNAS = 2;

    public Matriz(){
        matriz = new float[LINHAS][COLUNAS];
        float valor = 1.2F;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                matriz[l][c] = valor;
                valor = valor + valor; 
            }
        }
    }

    public void calculaDeterminante() {
        float det = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
        System.out.println("Determinante: " + det);
        //return det;
    }

    public void impressora() {
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.print(matriz[l][c] + "  ");
            }
            System.out.println("");
        }
    }
}
