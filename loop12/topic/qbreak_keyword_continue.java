package apna_java.loop12.topic;

import java.util.*;

public class qbreak_keyword_continue {

    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            int n;

            do {

                System.out.println("pls enter the num ");
                n = s.nextInt();

                if (n % 10 == 0) {
//                break;

                    continue;


                }
                System.out.println(n);

            } while (true);
        }



       

    }
}
