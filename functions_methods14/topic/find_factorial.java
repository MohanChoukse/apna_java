package apna_java.functions_methods14.topic;

import java.util.Scanner;

public class find_factorial {

    public static int facto(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;

        }
        return fact;
    }


    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num ");
        int n = s.nextInt();

        int ans = facto(n);

        System.out.println("your factorial is : " + ans);


        s.close();

    }
}
