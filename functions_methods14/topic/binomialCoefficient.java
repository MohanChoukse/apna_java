package apna_java.functions_methods14.topic;

public class binomialCoefficient {

    public static int facto(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;

        }
        return fact;
    }


    public static int binCoeff(int n, int r){

        int  n_fact = facto(n);
        int r_fact = facto(r);
        int rmn_fact = facto(n-r);

        return n_fact/ (r_fact*rmn_fact);

    }




    public static void main(String[] args) {

        System.out.println(binCoeff(5,2));


    }
}
