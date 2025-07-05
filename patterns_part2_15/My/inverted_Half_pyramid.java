package apna_java.patterns_part2_15.My;

public class inverted_Half_pyramid {

    public static void inverted_Half(int n) {
     
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <=n-i+1; j++) {
          System.out.print(j);
          
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    inverted_Half(5);
  }
}
