package apna_java.functions_methods14.my;

public class optimized_prime {

  public static boolean prime(int n) {
    if (n == 2) {
      return true;
    } else {
      for (int i = 2; i <= Math.sqrt(n); i++) {
          if (n % i == 0) {
              return false;
          }
        
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(prime(10));
  }
}
