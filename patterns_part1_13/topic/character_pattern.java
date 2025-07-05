package apna_java.patterns_part1_13.topic;

public class character_pattern {

  public static void main(String[] args) {
    int n = 4;
    char ch = 'A';

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
  }
}
