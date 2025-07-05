package apna_java.patterns_part2_15.My;

public class inverted_Rotated_half_Pyramid {

  public static void inverted_Rotated(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    inverted_Rotated(4);
  }
}
