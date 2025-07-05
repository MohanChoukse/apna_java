package apna_java.functions_methods14.my;

public class primeRange {

  public static void rangePrime(int n) {
    for (int i = 2; i <= n; i++) {
      if (optimized_prime.prime(i) == true) {
        System.out.print(i + " ");
      }
    }
  }

  public static void main(String[] args) {
    rangePrime(100);
  }
}
