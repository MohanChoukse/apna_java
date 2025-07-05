package apna_java.array_part2_17.assignment;

public class q5 {
    public static void triplets(int[] num) {
  /*  for (int i=0; i< num.length; i++){
        for (int j= i+1; j<num.length; j++){
            for (int k=j+1; k< num.length; k++){
                if (num[i]+num[j]+num[k]==0){
                    System.out.println(num[i]+" "+num[j]+" "+num[k]);
                }
            }
        }
    }
  */

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    if (num[i] + num[j] + num[k] == 0) {
                        System.out.println(num[i] + " " + num[j] + " " + num[k]);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] num = {-1, 0, 1, 2, -1, -4};
        triplets(num);
    }
}
