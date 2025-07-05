package apna_java.functions_methods14.topic;

// import apna_java.functions_methods14.topic.check_num_primeOnNot_inUseMethod.*;

public class primes_in_range {
    public static void primeRange(int n) {

        for (int i = 2; i <= n; i++) {
            boolean b = check_num_primeOnNot_inUseMethod.isPrime(i);
            if (b) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        primeRange(20);
    }
}
