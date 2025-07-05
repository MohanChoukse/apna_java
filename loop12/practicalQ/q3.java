package apna_java.loop12.practicalQ;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);


        int fact=1,n;
        System.out.println("Enter the num : ");
        n=s.nextInt();
        for (int i=1; i<=n; i++){

            fact *=i;
        }
        System.out.println(fact);

s.close();
    }
}
