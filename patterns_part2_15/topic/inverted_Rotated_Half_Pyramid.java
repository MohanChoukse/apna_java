package apna_java.patterns_part2_15.topic;

public class inverted_Rotated_Half_Pyramid {

    public static void irhp_Pattern(int totRow) {
        for (int i = 1; i <= totRow; i++) {
            for (int j = 1; j <= totRow - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        irhp_Pattern(4);

    }
}
