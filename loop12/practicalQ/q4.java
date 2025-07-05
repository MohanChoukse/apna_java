package apna_java.loop12.practicalQ;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);

        System.out.println("Enter the num : ");
        int n=s.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(n+" * "+i+" = "+i*n);
        }
s.close();
    }
}
