package topic;

public class swap_without_thirdVariable {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a=" + a + " b=" + b);
        // System.out.println(~5);

    }
}