package apna_java.loop12.my;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;
           // int a=0;

        if (n ==2 ) {
            System.out.println("its prime");
        }else{
             for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i == 0) {
                prime = false;
               // System.out.println(prime);
            }


            // System.out.println("\n out"+prime);
            // a++;
           
        }
        
        
        //System.out.println(a);
//System.out.println(Math.sqrt(2));



        if (prime == true) {
            System.out.println("its Prime :"+n);
        }else{
            System.out.println("its not Prime :"+n);
        }
        }
       

sc.close();

    }
}
