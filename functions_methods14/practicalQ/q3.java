package apna_java.functions_methods14.practicalQ;

import java.util.Scanner;

public class q3 {

    public static boolean isPalindrome(int n) {
        int r = 0;
        int k = n;
        while (n != 0) {
            int a = n % 10;
            r = r * 10 + a;
            n /= 10;
        }
        if (k == r) {
            return true;
        }
        return false;

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int g = s.nextInt();

        if (isPalindrome(g)) {
            System.out.println(g + " num is a palindrome");
        } else {
            System.out.println(g + " num is not a palindrome");
        }
        s.close();
    }
}
