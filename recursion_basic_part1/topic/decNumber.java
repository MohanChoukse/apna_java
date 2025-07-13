package apna_java.recursion_basic_part1.topic;

public class decNumber {
    public static void funDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.print(n);
        funDec(n - 1);
    }

    public static void funInc(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        funInc(n - 1);
        System.out.print(n);

    }

    public static void main(String[] args) {
        funDec(10);
        funInc(10);
    }
}
