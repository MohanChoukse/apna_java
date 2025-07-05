package apna_java.functions_methods14.topic;

public class decimalToBinary {

    public static void decToBin(int n) {
        int pow = 0;
        int binNum = 0;
        int myNum = n;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (int) (rem * Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("The "+myNum
                +" in binary "+binNum);
    }

    public static void main(String[] args) {

        decToBin(15);


    }
}
