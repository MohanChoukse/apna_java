package apna_java.loop12.my;

import java.util.Scanner;

public class sum_Of_evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number;
        int even =0, odd = 0;
        int choice;

        do{
            System.out.println("Enter a number");
            number = sc.nextInt();

            if ( number%2==0) {
                even+=number;
                System.out.println("its Even!!");
            }else{
                odd+=number;
                System.out.println("its Odd!!");
            }

            System.out.println(" \n\n Do you want to paly again press 1 for Yes or 0 for No :");
            choice = sc.nextInt();

        }while(choice == 1);

        System.out.println("A sum of Even : "+even);
        System.out.println("A sum of Odd : "+odd);

sc.close();
    }
}
