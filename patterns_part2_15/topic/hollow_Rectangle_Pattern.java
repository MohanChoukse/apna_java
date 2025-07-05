package apna_java.patterns_part2_15.topic;

public class hollow_Rectangle_Pattern {

  public static void hollow_Rectangle(int totRow, int totCol) {
    for (int i = 1; i <= totRow; i++) {
      for (int j = 1; j <= totCol; j++) {
        if (i == 1 || i == totRow || j == 1 || j == totCol) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    hollow_Rectangle(5, 6);
  }
}
