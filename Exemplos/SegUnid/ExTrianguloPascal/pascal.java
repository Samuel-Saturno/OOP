package Exemplos.SegUnid.ExTrianguloPascal;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nLinhas;
        
        System.out.print("Quantidade de linhas: ");
        nLinhas = sc.nextInt();
        int[][] triag = new int[nLinhas][];

        for (int l = 0; l < triag.length; l++) {
            triag[l] = new int[l+2];
            triag[l][0] = 1;
            triag[l][l+1] = 1;
            for (int c = 0; c < triag[l].length-1; c++) {
                triag[l][c] = triag[l-1][c] + triag[l-1][c-1];
            }
        }

        for (int l = 0; l < triag.length; l++) {
            for (int c = 0; c < triag[l].length; c++) {
                System.out.print(triag[l][c] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
