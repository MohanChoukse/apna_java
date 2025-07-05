package apna_java.array_part2_17.topic;

public class max_Subarray_part1 {
    public static void maxSubArray1(int[] num) {
    int max=Integer.MIN_VALUE;
    int crr;
    for (int i=0; i< num.length; i++){
        for (int j=i; j< num.length; j++){
            crr=0;
            for (int k=i; k<=j; k++){
                System.out.print(num[k]+" ");
                crr+=num[k];
            }
            System.out.print("="+crr);
            System.out.println();
            if (crr>max){
                max=crr;
            }
        }
    }
        System.out.println("\nMax sun is : "+max);
    }

    public static void main(String[] args) {
        int[] num = {1, -2, 6, -1, 3};
        maxSubArray1(num);
    }
}
