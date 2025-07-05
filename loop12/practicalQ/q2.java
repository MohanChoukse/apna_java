package apna_java.loop12.practicalQ;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int number;
        int choice;
        int even=0;
        int odd=0;

        do{
            System.out.println("Enter the number ");
            number=s.nextInt();
            if (number%2==0){
                even+=number;
            }else {
                odd+=number;
            }


            System.out.println("Do you want to continue? press 1 or not for press 0: ");
            choice =s.nextInt();
        }while(choice==1);

        System.out.println("Sum of even num is : "+ even);
        System.out.println("Sum of odd num is : "+ odd);


s.close();
    }
}
