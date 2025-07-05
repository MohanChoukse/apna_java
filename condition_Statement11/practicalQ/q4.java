package apna_java.condition_Statement11.practicalQ;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if (a%400==0){
            System.out.println("leap year");

        }else if (a%100==0){
            System.out.println("is not a leap year");
        }else if (a%4==0){
            System.out.println("leap year ");
        }else {
            System.out.println("not leap year");
        }



        s.close();
    }
}
