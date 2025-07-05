package apna_java.patterns_part2_15.topic;
public class inverted_Half_Pyramid_WithNum {
    public static void ihp_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ihp_Pattern(5);

    }
}
