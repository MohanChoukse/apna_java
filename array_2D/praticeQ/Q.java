package apna_java.array_2D.praticeQ;

public class Q {
    public static void main(String[] args) {

        // find the number of 8 in arr 2D
        // int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // if (arr[i][j] == 8) {
        // count++;
        // }
        // }
        // }
        // System.out.println(count);

        System.out.println();

        // print the secand row sum
        // int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        // int sum = 0;

        // for (int j = 0; j < arr[0].length; j++) {
        // sum += arr[1][j];
        // }

        // System.out.println(sum);

        System.out.println();

        // find the transpose
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int tra[][] = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                tra[j][i] = arr[i][j];

            }

        }

        for (int i = 0; i < tra.length; i++) {
            for (int j = 0; j < tra[0].length; j++) {
                System.out.print(tra[i][j]);
            }

            System.out.println();
        }
    }
}
