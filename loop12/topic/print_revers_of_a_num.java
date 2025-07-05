package apna_java.loop12.topic;

public class print_revers_of_a_num {
    public static void main(String[] args) {

        int a=12345;

        while(a>0){

            int last = a%10;
            System.out.print(last);
            a/=10;



        }






    }
}
