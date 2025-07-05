package apna_java.loop12.topic;
import java.util.*;
public class check_num_primeOnNot {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n =s.nextInt();
      boolean isPrime = true;
      if(n==2){
          System.out.println("n is prime");

      }else {

          for (int i=2; i<=n-1; i++){
              if (n%i==0){
                  isPrime=false;
              }
          }
              if (isPrime==true){
                  System.out.println("n is prime ");
              }else {
                  System.out.println("n is not prime");
              }


      }



      s.close();

    }
}
