package D2Arrays;

import java.util.Scanner;

public class MatrixMulti {
    static void matrixMul(int r1, int c1, int r2, int c2, int[][] m1, int[][] m2) {
        int[][] res = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*
         we need to get 4 inputs for the size of two Matrixes, r1, c1 ,r2 ,c2;
         if(c1!=r2) Return: Error(We Can't Do Multiplication with Different size of c1
         and r2);
         */
    }
}
