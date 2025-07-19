package apna_java.recursion_basic_part1.topic;

public class sumNaturalNum {

    public static int sumNatural(int n) {
        if (n == 1) {
            return 1;
        }
        int nm1 = sumNatural(n - 1);
        return n + nm1;

    }

    public static void main(String[] args) {
        System.out.println(sumNatural(5));
    }
}
