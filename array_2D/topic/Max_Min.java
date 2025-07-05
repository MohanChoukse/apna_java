package apna_java.array_2D.topic;

import java.util.Scanner;

public class Max_Min {

    public static void matrixMaxmin(int mat[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                max = Math.max(max, mat[i][j]);

                min = Math.min(min, mat[i][j]);

            }
        }
        System.out.println(max + " " + min);
    }

    public static void main(String[] args) {
        int mat[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        matrixMaxmin(mat);
        sc.close();
    }
}
