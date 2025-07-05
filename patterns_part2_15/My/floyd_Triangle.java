package apna_java.patterns_part2_15.My;

public class floyd_Triangle {

  public static void Triangle(int n) {
    int a = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(a++ + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Triangle(5);
  }
}
