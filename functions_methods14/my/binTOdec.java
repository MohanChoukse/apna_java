package apna_java.functions_methods14.my;

public class binTOdec {

    public static void bin$dec(int n) {
        int dec = 0, pow =0;
        while (n > 0) {
            int last = n % 10;
            dec += (int) (last * Math.pow(2, pow));
            n = n / 10;
            pow++;
        }
       System.out.println("Decimal value is: " + dec);
    }


    public static void main(String[] args) {
        bin$dec(1010100);

    }
}