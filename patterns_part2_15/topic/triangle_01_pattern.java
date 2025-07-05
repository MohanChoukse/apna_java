package apna_java.patterns_part2_15.topic;

public class triangle_01_pattern {
    public static void zeroOne_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zeroOne_triangle(5);
    }
}
