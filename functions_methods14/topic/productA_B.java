package apna_java.functions_methods14.topic;
import java.util.Scanner;
public class productA_B {

    public static int product(int a , int b){
        int c = a * b;
        return c;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the fist num ");
        int a =s.nextInt();
        System.out.println("Enter the sec. num ");
        int b = s.nextInt();

       int d= product(a,b);
        System.out.println("you sum is : "+d);

s.close();
    }

}
