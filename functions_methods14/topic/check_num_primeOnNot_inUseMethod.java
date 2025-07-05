package apna_java.functions_methods14.topic;
import java.util.Scanner;
public class check_num_primeOnNot_inUseMethod {

    public static boolean isPrime(int n) {

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

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your num ");
        int n =s.nextInt();

        if (isPrime(n) == true) {
            System.out.println("Num is prime");

        } else {
            System.out.println("Num is not prime");
        }

        s.close();
    }
}
