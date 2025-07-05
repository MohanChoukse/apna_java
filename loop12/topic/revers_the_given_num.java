package apna_java.loop12.topic;

public class revers_the_given_num {
    public static void main(String[] args) {

        int n = 3247437;
        int rev = 0;
        int last = 0;
        while (n > 0) {

            last = n % 10;
            rev = (rev * 10) + last;

            n /= 10;

        }
        System.out.println(rev);
    }
}
