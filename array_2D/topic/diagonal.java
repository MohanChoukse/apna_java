package apna_java.array_2D.topic;

public class diagonal {

    public static int diagonoalMat(int mat[][]) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            // pd
            sum += mat[i][i];

            if (i != mat.length - 1 - i) {
                sum += mat[i][mat.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.println(diagonoalMat(matrix));
    }
}
