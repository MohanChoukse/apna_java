package apna_java.array_part1_16.topic;

public class print_Subarray {

    public static void printSubArray(int[] num) {
        int ts = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + ", ");
                }
                System.out.print("]");
                ts++;
                System.out.println("\n");
            }
        }
        System.out.println("The Sub Array : " + ts);
    }

    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10};
        printSubArray(num);

    }
}
