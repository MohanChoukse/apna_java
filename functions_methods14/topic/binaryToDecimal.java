package apna_java.functions_methods14.topic;

public class binaryToDecimal {

    public static void binToDec(int binNum) {
        int lastD;
        int n = binNum;
        int dec = 0;
        int pow = 0;

        while (binNum > 0) {
            lastD = binNum % 10;
            dec += (int) (lastD * Math.pow(2, pow));
            binNum /= 10;
            pow++;


        }

        System.out.println("This is binary " + n + " in decimal is : " + dec);


    }


    public static void main(String[] args) {


        binToDec(10100011);
    }
}
