package apna_java.functions_methods14.practicalQ;

public class q5 {

    public static int sumDigits(int n) {
        // int myNum = n;
        int add = 0;
        while (n > 0) {
            int a = n % 10;
            add += a;
            n = n / 10;
        }
        return add;
    }

    public static void main(String[] args) {

        System.out.println(sumDigits(123));


    }
}
