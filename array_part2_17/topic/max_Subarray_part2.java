package apna_java.array_part2_17.topic;

public class max_Subarray_part2 {
    public static void maxSubArray2(int[] num) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[num.length];
        prefix[0] = num[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
//              System.out.print(prefix[i]+"\n");
        }
//        int a=0,b=0, c=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {

                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
//                if (i==0){
//                    currSum =  prefix[j];
//                }else {
//                    c=prefix[i];
//                     a =prefix[i - 1];
//                     b=prefix[j];
//                    currSum =prefix[j] -a;
//                }
//                System.out.print(i+" "+j+" "+currSum +"\n");
//                System.out.printf("i = %d , j = %d , prefixJ = %d , pre i=%d-1 = %d , curr = %d \n", i,j,b ,i, a,currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;

                }
            }
        }

        System.out.println("Max Sub : " + maxSum);

    }

   /* public static void max(int[] num){

        int currSum ;
        int maxSum = Integer.MIN_VALUE;
        int[] pre = new int [num.length];
        pre[0]=num[0];
        for (int i=1; i< pre.length; i++){
            pre[i]= pre[i-1]+ num[i];
        }

        for (int i=0; i< num.length; i++){
            for (int j=i; j< num.length; j++ ){
                currSum = (i == 0) ? pre[i] : pre[j]-pre[i-1];

                if (maxSum< currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }*/

    public static void main(String[] args) {
        int[] num = {1, -2, 6, -1, 3};

       maxSubArray2(num);
       // max(num);
    }
}
