package apna_java.condition_Statement11.practicalQ;

import java.util.Scanner;

public class q1 {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        int b = s.nextInt();
//        char c = s.next().charAt(0);
//
//        switch (c) {
//            case '+' -> System.out.println(a + b);
//            case '-' -> System.out.println(a - b);
//            case '*' -> System.out.println(a * b);
//            case '/' -> System.out.println(a / b);
//            case '%' -> System.out.println(a % b);
//            default -> System.out.println("error");
//        }


        System.out.println("Enter the num ");
        int a = s.nextInt();


        String ans = (a>0)?"positive":"negative";
        System.out.println(ans);







        s.close();

    }
}