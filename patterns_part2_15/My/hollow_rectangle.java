package apna_java.patterns_part2_15.My;

public class hollow_rectangle {

  static void hollow_rectangle_method(int row, int col) {
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= col; j++) {
        if (i == 1 || i == row || j == 1 || j == col) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    hollow_rectangle_method(5, 6);
  }
}
