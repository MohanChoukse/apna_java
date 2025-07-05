package apna_java.array_part1_16.topic;

public class reverse_Array {

    public static void reverseArray(int[] arr){
        int first =0, last =arr.length-1;
        while (first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5};
        reverseArray(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
