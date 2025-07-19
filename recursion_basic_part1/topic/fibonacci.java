package apna_java.recursion_basic_part1.topic;

public class fibonacci {
    static int fibonacciNum(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int fib = fibonacciNum(n - 1) + fibonacciNum(n - 2);
        return fib;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciNum(5));
    }
}
