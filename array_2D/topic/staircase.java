package apna_java.array_2D.topic;

public class staircase {
    public static boolean staircaseSearch(int matrix[][], int key) {

        // by using top right 40

        // int row = 0;
        // int col = matrix[0].length - 1;
        // while (row < matrix.length && col >= 0) {
        // if (matrix[row][col] == key) {
        // System.out.println(row + " " + col);
        // return true;
        // } else if (key < matrix[row][col]) {
        // col--;
        // } else {
        // row++;
        // }
        // }

        // System.out.println("Not found!");
        // return false;

        // by using bottom left 32
        int row = matrix.length - 1;
        int col = 0;

        while (col < matrix.length && row >= 0) {
            if (matrix[row][col] == key) {
                System.out.println(row + " " + col);
                return true;
            } else if (key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        staircaseSearch(matrix, 33);
    }
}
