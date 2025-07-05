package apna_java.array_part2_17.topic;

public class max_Subarray_part3 {

    public static int kadanesAlog(int[] num) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;


        for (int i = 0; i < num.length; i++) {

            cs = cs + num[i];
            if (cs < 0) {
            cs = 0;
            }
            ms = Math.max(ms, cs);
           // System.out.printf("cs %d num %d ms %d \n", cs, num[i], ms)`;
        }

        return ms;
    }

    public static void main(String[] args) {
        int[] num = {-2, -3, 4, -1, -2, 1, 5, -3};

      //  int[] num = {-1, -2, -3, -4};
        int max = kadanesAlog(num);

        System.out.println("max sum is "+max);
    }
}
